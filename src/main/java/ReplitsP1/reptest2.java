package ReplitsP1;

import java.util.Scanner;

public class reptest2 { public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();

    for (int i = 0; i < word.length(); i=i+2) {
        System.out.print(word.charAt(i));

    }



    }
}