package ReplitsP1;

import java.util.Scanner;

public class RepHW2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your gender: ");
        char gender = scan.next().charAt(0);

        if (gender == 'M') {
            {
                System.out.println("Please enter your age");
            }
            int age = scan.nextInt();
            if (age > 25) {
                System.out.println("Man");
            } else System.out.println("Boy");
        }

        if (gender == 'F') {
            {
                System.out.println("Please enter your age");
            }
            int age = scan.nextInt();
            if (age > 25) {
                System.out.println("Woman");
            } else System.out.println("Girl");
        }


    }
        }


