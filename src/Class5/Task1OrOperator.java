package Class5;

import java.util.Scanner;

public class Task1OrOperator {
    public static void main(String[] args) {
        String season1="Spring";
        String season2="Summer";

        System.out.println("Please enter your birth month");
        Scanner scan=new  Scanner(System.in);
        String birthmonth=scan.next();
        if ((birthmonth.equalsIgnoreCase("March")||birthmonth.equalsIgnoreCase("April")
                ||birthmonth.equalsIgnoreCase("May")))
        {System.out.println("You were born is season "+season1);}
        else if  ((birthmonth.equalsIgnoreCase("June") ||
                birthmonth.equalsIgnoreCase("July") ||
                birthmonth.equalsIgnoreCase("August")))
        {System.out.println("You were born is season "+season2);}




    }
}
