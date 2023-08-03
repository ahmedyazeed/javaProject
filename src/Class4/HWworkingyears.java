package Class4;

import java.util.Scanner;

public class HWworkingyears {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many years did you work?");
        double workedyears = scan.nextDouble();

        if (workedyears >= 5){System.out.println("You are eligible for the bonus, How much is your salary?");
        }
        else{System.out.println("You are not eligible for the bonus");}
        double salary = scan.nextDouble();
        if (salary > 50000) {System.out.println("your bonus is 5000");}
        else {System.out.println("your bonus is 3000");}







    }
}
