package Class12;

import java.util.Scanner;

public class E1Methods {public static void main(String[] args) {

    takeUserInput();


}
    static void takeUserInput(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please, enter your name");
        String name=scan.nextLine();
        System.out.println("Please, enter your age");
        int age=scan.nextInt();
        System.out.println("Your name is "+name+" and you are "+age+" years old");

    }

}