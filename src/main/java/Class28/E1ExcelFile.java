package Class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {
        //Location of the file
        String path = "C:\\Users\\ahmed\\IdeaProjects\\JavaProject\\Files\\Employees.xlsx";
        //Class that brings the data in the form of bytes into the memory
        FileInputStream fis = new FileInputStream(path);
        // That special Class which knows how to handle Excel files
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        //Accessing the sheet from the xlsx file
        Sheet sheet = workbook.getSheet("Sheet1");
        // gives us the row at index 1
      /*  Row row=sheet.getRow(1);
        //Gives us the column/cell at index number 2
        Cell cell=row.getCell(2);*/
       /* System.out.println(cell);*/
        Row row;
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
             row= sheet.getRow(i);
            System.out.println();

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                System.out.print(row.getCell(j)+" ");

            }

        }

    }
}
