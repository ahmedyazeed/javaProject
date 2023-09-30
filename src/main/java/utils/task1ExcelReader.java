package utils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class task1ExcelReader {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>> data=ExcelReader.readExcelData("C:\\Users\\ahmed\\OneDrive\\Desktop\\Sales.xlsx","Sheet1");
        System.out.println(data);

    }
}