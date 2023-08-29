package Class12;

import java.util.Scanner;

public class Calculator {

   void add(){


       Scanner sc=new Scanner(System.in);
       System.out.println("Please enter the first number");
       int num1= sc.nextInt();
       System.out.println("Please enter the second number");
       int num2= sc.nextInt();
       int sum=num1+num2;
       System.out.println("sum of these numbers is "+sum);}

       void sub(int num1,int num2){
           Scanner sc=new Scanner(System.in);
           System.out.println("Please enter the first number");
           num1= sc.nextInt();
           System.out.println("Please enter the second number");
            num2= sc.nextInt();
           int sub=num1-num2;
           System.out.println("sum of these numbers is "+sub);}

           void multiply(int number1, int number2){


               int result=number1*number2;
               System.out.println(result);
           }






   }


