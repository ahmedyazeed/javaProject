package Replits;

import java.util.Scanner;

public class reptest {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter 3 distinct numbers ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        if (a>b){if (a>c) System.out.println("The largest number is "+a);}
        if (b>a){if (b>c) System.out.println("The largest number is "+b);}
        if (c>a){if (c>b) System.out.println("The largest number is "+c);}
    }
}
