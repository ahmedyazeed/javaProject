package Class4;

import java.util.Scanner;

public class HWcreditcard {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Do you have credit card?");

        String a=scanner.nextLine();
        double b=(scanner.nextDouble());
        double minimumBalance=1000;

        if (a.equals("No"))
        {System.out.println("we are offering you new credit card");}

        else if (a.equals("Yes"))
        {System.out.println("What is balance on the card? ");}

        else if (b>minimumBalance) {System.out.println("Pay off immediately");}

        else {System.out.println("You can spend more");}





    }
}
