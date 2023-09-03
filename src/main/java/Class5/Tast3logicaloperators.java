package Class5;

import java.util.Scanner;

public class Tast3logicaloperators {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter a number");
        double num=scan.nextDouble();
         if (num>=1&&num<=10) System.out.println("small");
        else if (num>=11&&num<=100) System.out.println("medium");
         else if (num>=101&&num<=1000) System.out.println("large");


        }


    }

