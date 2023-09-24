package ReplitsP1;

import java.util.Scanner;

public class reptest4 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine().replaceAll(" ","");

        StringBuilder obj=new StringBuilder(givenString);

        obj.reverse();

        if (givenString.equalsIgnoreCase(obj.toString())){
            System.out.println("true");}
        else System.out.println("false");



    }}
