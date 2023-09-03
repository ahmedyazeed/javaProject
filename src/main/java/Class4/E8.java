package Class4;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name = scanner.next();
        if (name.equals("Ahmed")) {
            System.out.println("Welcome AHMED");
        } else if (name.equals("Marina")) {
            System.out.println("Welcome Wife");
        }
    else {System.out.println("Wrong name");}



    }
}
