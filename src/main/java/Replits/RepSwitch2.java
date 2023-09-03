package Replits;

import java.util.Scanner;

public class RepSwitch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the roll number of the Child");
        int a= sc.nextInt();
        switch (a){
        case 101:
        {System.out.println("Student name: Ramesh");}
        break;
            case 102:
            {System.out.println("Student name: Mahesh");}
            break;
            case 103:
            {System.out.println("Student name: Mukesh");}
            break;
            default: {
                System.out.println("Not found Student name: in Class");}}




    }
}
