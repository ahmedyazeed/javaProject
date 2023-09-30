package Class27;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\ahmed\\IdeaProjects\\JavaProject\\Files\\Employees.xlsx";
        FileInputStream fis= new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        Sheet sheet1= workbook.getSheet("Sheet1");
        Row row= sheet1.getRow(1);
        Cell cell= row.getCell(2);
        System.out.println(cell);

    }
}
