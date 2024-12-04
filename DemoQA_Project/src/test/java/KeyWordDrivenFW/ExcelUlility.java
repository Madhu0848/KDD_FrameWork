package KeyWordDrivenFW;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUlility {

    public static Sheet readDataFromExcel(String fileName) throws IOException {

        FileInputStream fis = new FileInputStream(fileName);
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(1);
        return sheet;
    }


}
