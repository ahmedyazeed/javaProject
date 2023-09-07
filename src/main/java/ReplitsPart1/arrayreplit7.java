package ReplitsPart1;

public class arrayreplit7 {
    public static void main(String[] args) {
        int[] years = new int[11];

        // Populate the array with years 2010 to 2020
        for (int i = 0; i < years.length; i++) {
            years[i] = i+2010;
        }

        // Print all the years
        for (int i = 0; i < years.length; i++) {
            System.out.println(years[i]);}
    }}