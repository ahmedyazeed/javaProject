package ReplitsP1;

import java.util.Scanner;

public class reptest {
    public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String s = inp.nextLine();
            //write your code below

        for (int i = s.length(); i >-2 ; i--) {
            System.out.print(s.charAt(i-1));

        }

        }
    }