package Class5;

import java.util.Scanner;

public class HWcurrentTime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the current time (use 24 hour format)");
        double time=scan.nextDouble();

        if (time>=1&&time<=11){
            System.out.println("Morning");}
        else if (time>=12&&time<=15){
            System.out.println("Afternoon");}
        else  if (time>=16&&time<=20){
            System.out.println("Evening");}
        else  if (time>=21||time<=24){
            System.out.println("Night");}
    }
}
