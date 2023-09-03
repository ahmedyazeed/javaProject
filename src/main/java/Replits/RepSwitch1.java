package Replits;

import java.util.Scanner;

public class RepSwitch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println( "Please enter your favorite car make");
        String a= sc.next();
        switch (a){
        case "BMW":
        {System.out.println("Your favorite car is german car");}
        break;
            case "Toyota": {System.out.println("Your favorite car is japanese car");}
            break;
            case "Maserati": {System.out.println("Your favorite car is italian car");}
            break;
            default: {
                System.out.println("Your favorite car is unknown");}}




    }
}
