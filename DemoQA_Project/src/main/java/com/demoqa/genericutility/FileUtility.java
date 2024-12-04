package com.demoqa.genericutility;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
   @Author Madhuri
 */
public class FileUtility {

    public String getDataFromProperties(String key) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\DemoQA_Project\\src\\main\\resources\\configData\\commonData.properties");
        Properties pro = new Properties();
        pro.load(fis);

       String data = pro.getProperty(key);
        return data;
    }
   public  void writeDataFromProperties() throws IOException {
    FileInputStream fis = new FileInputStream("./resources/configData/commonData.properties");
    Properties pro = new Properties();
    pro.setProperty("username", "admin");
    pro.setProperty("password", "admin");

       FileOutputStream fos = new FileOutputStream("./configData/commondata.properties");
       pro.store(fos, "updated properties");


}
    public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\DemoQA_Project\\src\\main\\resources\\configData\\application.xlsx");
        Workbook wb = WorkbookFactory.create(fis);

        String data = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
        System.out.println("data " + data);
        return data;

    }


}
