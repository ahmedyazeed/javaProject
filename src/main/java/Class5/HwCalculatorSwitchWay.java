package Class5;

import java.util.Scanner;

public class HwCalculatorSwitchWay {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter any number");
        double a=scan.nextDouble();
        System.out.println("please press +,-,* or /");
        char b=scan.next().charAt(0);
        System.out.println("please enter one more number");
        double c=scan.nextDouble();
        switch (b) {
            case '+':
                System.out.println(a + c);
                break;
            case '-':
                System.out.println(a - c);
                break;
            case '*':
                System.out.println(a * c);
                break;
            case '/':
                System.out.println(a / c);
                break;
        }





    }
}
