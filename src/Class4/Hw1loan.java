package Class4;

import java.util.Scanner;

public class Hw1loan {
    public static void main(String[] args) {
        Scanner tool=new Scanner(System.in);

        double criteria=200000;
        System.out.println("What is the needed loan amount?");
        double loanamount=tool.nextDouble();
        if (loanamount<=criteria){
            System.out.println("Your loan is Approved, Congrats");
        }
        else {
            System.out.println("Your loan is rejected, We are sorry");}

    }
}
