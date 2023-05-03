package Day12;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Excel {

    @Test
    public void readExcel() throws IOException {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\excelData.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook wb = WorkbookFactory.create(fis);

        Sheet sheet = wb.getSheetAt(0);
        Row row4 = sheet.getRow(3);
        Cell cell4_6 = row4.getCell(5);
        String cellValue = cell4_6.toString();
        System.out.println("cellValue = " + cellValue);

        Cell cell4_3=row4.getCell(2);

        wb.close();





    }


}
