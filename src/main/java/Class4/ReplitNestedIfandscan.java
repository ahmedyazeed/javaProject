package Class4;


import java.util.Scanner;

public class ReplitNestedIfandscan {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter first number");
        double x=scan.nextDouble();

        System.out.println("Please enter second number");
        double y=scan.nextDouble();

        if (x*y>=0) {System.out.println("true");}
        else System.out.println("false");



    }
}
