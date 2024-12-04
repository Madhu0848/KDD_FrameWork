package FileHandling;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class XLSXOperation {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos =new FileOutputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\DemoQA_Project\\src\\main\\Repository\\TempFile.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Demo1");

        for(int i=0;i<10;i++){
            XSSFRow row=sheet.createRow(i);

            for (int j= 0; j<4; j++) {
                row.createCell(j).setCellValue("Added1"+j);

            }
        }
        workbook.write(fos);
        System.out.println("WorkBook Created Successfully");
        workbook.close();

        /* read the data from Excel*/
        int num = sheet.getLastRowNum();
		for(int i =0; i<sheet.getLastRowNum();i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<row.getLastCellNum();j++ ) {
				System.out.println(row.getCell(j));
			}		}

    }
}
