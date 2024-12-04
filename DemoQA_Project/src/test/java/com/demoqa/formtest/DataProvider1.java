package com.demoqa.formtest;

import BaseClassUtility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 extends BaseClass {

    @Test(dataProvider = "getData")
    public void bookAplicationStore(String un, String pw) {
        System.out.println("Create test");
        WebElement bookStrore = driver.findElement(By.xpath("//div[text()='Book Store Application']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", bookStrore);
        bookStrore.click();

        WebElement Login = driver.findElement(By.xpath("//span[text()='Login']"));
        js.executeScript("arguments[0].scrollIntoView(true);", Login);
        js.executeScript("arguments[0].click();", Login);

        driver.findElement(By.id("userName")).sendKeys(un);
        driver.findElement(By.id("password")).sendKeys(pw);
        WebElement Login1 = driver.findElement(By.xpath("//button[text()='Login']"));
        js.executeScript("arguments[0].scrollIntoView(true);", Login1);
        js.executeScript("arguments[0].click();", Login1);
    }

      @DataProvider
        public Object[][] getData () {
            Object[][] data = new Object[2][2];
            data[0][0] = "Madhurikumari";
            data[0][1] = "Madhu@123";
            return data;

        }
    }

