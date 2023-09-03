package Class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your full name");
        String fullname=scanner.nextLine();
        System.out.println("Your Full Name Is "+fullname);
        String password=scanner.nextLine();
        if (password=="1234"){
        System.out.println("Thank you, Please wait");}
        else {
            System.out.println("Wrong Password");}




    }
}
