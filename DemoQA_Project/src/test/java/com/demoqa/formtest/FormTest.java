package com.demoqa.formtest;

import BaseClassUtility.BaseClass;
import com.demoqa.genericutility.ExcelUtility;
import com.demoqa.genericutility.FileUtility;
import com.demoqa.objectrepositoryutility.FormsPage;
import com.demoqa.webdriverutility.browserutility;
import org.apache.xmlbeans.impl.xb.ltgfmt.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;

public class FormTest extends BaseClass {

    FileUtility fLib=new FileUtility();
    ExcelUtility eLib=new ExcelUtility();
    browserutility bLib=new browserutility();

    @Test
    public void formTest() throws Throwable {

        ExcelUtility eLib=new ExcelUtility();
        String FirstName=eLib.getDataFromExcel("Sheet1" ,1,0);
        String LastName=eLib.getDataFromExcel("Sheet1" ,1,1);
        String Email=eLib.getDataFromExcel("Sheet1" ,1,2);
        String Mobile=eLib.getDataFromExcel("Sheet1" ,1,3);
        FormsPage fp=new FormsPage(driver);
        fp.getFormsText();
        bLib.scrollByJavascript(driver);
        bLib.clickOnElementUsingJavaScript(fp.getFormsText(), driver);

        bLib.clickOnElementUsingJavaScript(fp.getPracticeFormText(), driver);
        fp.getFirstNameText().sendKeys(FirstName);
        fp.getLastNameText().sendKeys(LastName);
        fp.getUserEmailText().sendKeys(Email);

        bLib.clickOnElementUsingJavaScript(fp.getGenderRadioButton(), driver);

        fp.getMobileNumberText().sendKeys(Mobile);
        fp.getBirthDateText().sendKeys("1990-01-01");
        bLib.clickOnElementUsingJavaScript(fp.getBirthDateText(), driver);

        /*Select Month*/
        Select select =new Select(fp.getMonthSelect());
        select.selectByValue("10");

        /*Select Years*/
        Select select2 =new Select(fp.getYearSelect());
        select2.selectByIndex(1);
        driver.findElement(By.xpath("//div[text()='11']")).click();

        fp.getSubjectsInput().sendKeys("Register");
        //fp.getHobbiesCheckbox().click();
        bLib.clickOnElementUsingJavaScript(fp.getSubjectsInput(), driver);

      fp.getUploadPicture().sendKeys("C:\\Users\\Qapitol QA\\Downloads\\WhatsApp Image 2024-11-07 at 16.41.03.jpeg");
      bLib.scrollByJavascript(driver);

     // fp.getStateSelect();
        Actions actions = new Actions(driver);
        actions.moveToElement(fp.getStateSelect()).perform();
        actions.clickAndHold().perform();

        //fp.getHaryana().click();
       // bLib.clickOnElementUsingJavaScript(fp.getHaryana(), driver);
      //  fp.getCitySelect();
       // actions.moveToElement(fp.getCitySelect()).perform();
       // actions.clickAndHold().perform();

        //fp.getKarnal();
       // bLib.clickOnElementUsingJavaScript(fp.getKarnal() ,driver);
        bLib.clickOnElementUsingJavaScript(fp.getSubmitButton() ,driver);















    }
}
