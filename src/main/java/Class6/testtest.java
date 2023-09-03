package Class6;

import java.util.Scanner;

public class testtest {
    public static void main(String[] args) {

        int x;
        int sum=0;
        Scanner sc=new Scanner(System.in);

        do {System.out.println("please enter the price of item or -1 to terminate");
        x=sc.nextInt();
        sum=sum+x;
            System.out.println(sum);

        }while (x!=-1);{System.out.println("terminated");}



    }
}
