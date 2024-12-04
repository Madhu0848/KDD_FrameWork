package Test;

import com.demoqa.genericutility.ExcelUtility;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Login {

    @Test (dataProvider = "getData")
    public void Login( String uname, String pwd) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://139.59.27.246:3000/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
        driver.findElement(By.id("userNameOrEmail")).sendKeys(uname);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();

        Thread.sleep(3000);
       WebElement invaild = driver.findElement(By.xpath("//div[@role=\"alert\"]"));
       String Expected = invaild.getText();
        Assert.assertEquals(invaild.getText(),Expected );

    }
    @DataProvider
    public Object[][] getData () throws Throwable {
        ExcelUtility elib= new ExcelUtility();

        int Rowcount = elib.getRowCount("Sheet1");
        Object[][]objeArr= new Object[Rowcount][2];

        for(int i=0;i<Rowcount;i++) {
            objeArr[i][0]=elib.getDataFromExcel("Sheet1", i+1, 0);
            objeArr[i][1]=elib.getDataFromExcel("Sheet1", i+1, 1);
        }return objeArr;

    }
}