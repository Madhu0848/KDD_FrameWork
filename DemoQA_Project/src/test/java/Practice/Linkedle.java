package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class Linkedle {

    @Test
    public void testL() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.linkedin.com");
        driver.findElement(By.xpath("//a[contains(.,  'Sign in')]")).click();
        driver.findElement(By.id("username")).sendKeys("kmadhuri645@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Madhu@123");
        driver.findElement(By.xpath(" //button[@aria-label='Sign in']")).click();
        driver.findElement(By.xpath("//Strong[text()='Start a post, try writing with AI']")).click();
        WebElement imageText= driver.findElement(By.xpath("(//span[@class='share-promoted-detour-button__icon-container']/*)[1]"));
        // imageText.click();
        driver.switchTo().alert().dismiss();
        Thread.sleep(6000);
        // driver.findElement(By.xpath("//input[@id='media-editor-file-selector__file-input']")).sendKeys("C:/Users/Qapitol QA/Desktop/photo.jpeg");
        driver.findElement(By.xpath("//input[@id='media-editor-file-selector__file-input']")).sendKeys("C:\\Users\\Qapitol QA\\Desktop\\ga,me.jpg");
        Thread.sleep(6000);
        Actions actions = new Actions(driver);
        // Press the ESC key
        actions.sendKeys(Keys.ESCAPE).perform();
        driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//button[@id='ember332']")).click();

    }
    @Test
    public void testL2() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com");
        WebElement createNewPageText = driver.findElement(By.linkText("Create new account"));
        createNewPageText.click();

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("neha");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("kumari");

        // Select day, month, and year
        WebElement DateBirth = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));

        // Select day
        Select selectDay = new Select(DateBirth);
        selectDay.selectByValue("5");

        // Select month
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(5);  // May (Index 5, if 0-based)

        // Select year
        Select selectYear = new Select(year);
        selectYear.selectByValue("1990");

        //select gender
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        // Fill in mobile number
        WebElement mobileText = driver.findElement(By.name("reg_email__"));
        mobileText.sendKeys("8210688120");

        // Fill in password
        WebElement passwordTextField = driver.findElement(By.name("reg_passwd__"));
        passwordTextField.sendKeys("your_secure_password");

        // Click on "Sign Up" button
        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();

        // Close the driver
        // driver.quit();


    }
}
