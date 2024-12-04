package BaseClassUtility;

import com.demoqa.genericutility.ExcelUtility;
import com.demoqa.genericutility.FileUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;

public class BaseClass {

     /*Create Object*/

    FileUtility fLib=new FileUtility();
    ExcelUtility eLib =new ExcelUtility();

    public WebDriver driver ;


   // @Parameters("BROWSER")
    @BeforeClass(alwaysRun = true)
   // public void launchBrowser(String browser) throws IOException {

    public void launchBrowser() throws IOException {
        System.out.println("launch The Browser");
        String BROWSER=fLib.getDataFromProperties("browser");
        String URL=fLib.getDataFromProperties("url");

        if(BROWSER.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (BROWSER.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
            else if(BROWSER.equalsIgnoreCase("edge")) {
            driver = new ChromeDriver();
          }
            else {
                driver = new ChromeDriver();
        }

            driver.get(URL);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

        }
        @AfterClass
        public void closeBrowser() {
       // driver.quit();
        }


    }




