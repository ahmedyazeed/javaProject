package Class5;

import java.util.Scanner;

public class task1witch {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your country");
        String country=scan.nextLine();

        switch (country){
            case "Egypt":
                System.out.println("Arabic");
                break;
            case "Italy":
                System.out.println("Italian");
                break;
            case "USA":
                System.out.println("English");
                break;
            case "Iran":
                System.out.println("Persian");
                break;
            default:
                System.out.println("Unknown language");

        }





    }
}
