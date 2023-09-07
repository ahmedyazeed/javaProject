package ReplitsPart1;

import java.util.Scanner;

public class reptest7 {
    public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String word = inp.nextLine();

        for (int i = 1; i < word.length(); i++) {
            char c=word.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {System.out.print(c);};
        }
    }}
