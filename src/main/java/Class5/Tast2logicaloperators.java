package Class5;

import java.util.Scanner;

public class Tast2logicaloperators {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your height");
        double height=scan.nextDouble();
        if (height<60) System.out.println("short");
        else if (height>=60&&height<=72) System.out.println("medium");
        else if (height>72) System.out.println("tall");

        }


    }

