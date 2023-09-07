package ReplitsPart1;

import java.util.Scanner;

public class ReplitLogicaloperators {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Is it weekend?");

        boolean word1=sc.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean word2=sc.nextBoolean();
        boolean a=true;
        boolean c=a;
        String b="yes";

        if (word1==true&&!(word2==true)){
            System.out.println("Looks like you need to drink water");}
        else if (word1==true && word2==true){
            System.out.println("Looks like you need to drink coffee");}
        else if (word1=false&&word2==true){
            System.out.println("Looks like you need to drink water");}
        else {
            System.out.println("Looks like you need to drink nothing");}



    }}


