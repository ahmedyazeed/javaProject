package Class5;

import java.util.Scanner;

public class HwAvgScore {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your quiz score");
        double quizscore=scan.nextDouble();
        System.out.println("please enter your mid Term score");
        double midTermScore=scan.nextDouble();
        System.out.println("please enter your final score");
        double finalscore=scan.nextDouble();
        double averagescore=(quizscore+midTermScore+finalscore)/3;

        if (averagescore>=90){System.out.println("grade A");}
        if (averagescore>=70&&averagescore<90){System.out.println("grade B");}
        if (averagescore>=50&&averagescore<70){System.out.println("grade C");}
        if (averagescore<50){System.out.println("grade F");}


        }


    }

