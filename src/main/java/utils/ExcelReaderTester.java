package utils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {
      List<Map<String,String>>data= ExcelReader.readExcelData("C:\\Users\\ahmed\\IdeaProjects\\JavaProject\\Files\\Employees.xlsx");
        System.out.println(data.get(1));
    }
}