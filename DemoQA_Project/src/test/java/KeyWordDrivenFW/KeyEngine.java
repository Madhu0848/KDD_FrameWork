package KeyWordDrivenFW;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
//public static WebDriver driver;

public class KeyEngine {

    public void service(String fileName) throws IOException {

        ExcelUlility excel = new ExcelUlility();
         Sheet sheetData = excel.readDataFromExcel(fileName);

          for (Row row : sheetData) {

          }


    }

}
