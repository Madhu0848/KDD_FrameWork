package com.demoqa.genericutility;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.Normalizer;
import java.util.Formatter;

/*
   Author Madhuri
 */
public class ExcelUtility {

    public String getDataFromExcel(String sheetName, int rowNum, int celNum) throws Throwable {
        FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\DemoQA_Project\\src\\main\\resources\\configData\\application.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        String data = wb.getSheet(sheetName).getRow(rowNum).getCell(celNum).getStringCellValue();
        wb.close();
        return data;
    }

    public int getRowCount(String sheetName) throws Throwable {
        FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\DemoQA_Project\\src\\main\\resources\\configData\\application.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        int rowCount = wb.getSheet(sheetName).getLastRowNum();
        wb.close();
        return rowCount;
    }

    public void setDataIntoExcel(String sheetName, int rowNum, int celNum, String data) throws Throwable {
        FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\HybridFrameWork\\src\\main\\resources\\configData\\application.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        wb.getSheet(sheetName).getRow(rowNum).createCell(celNum);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\HybridFrameWork\\src\\main\\resources\\configData\\application.xlsx");
        wb.write(fos);
        wb.close();
    }


}
