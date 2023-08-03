package Class4;

import java.util.Scanner;

public class HWDMV {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the length");
        int a = scan.nextInt();
        System.out.println("Please enter the width");
        int b = scan.nextInt();

        if (a > b) {
            System.out.println("The shape of your object is rectangle");
        }
        if (a == b) {
            System.out.println("The shape of your object is square");
        }
    }
    }

