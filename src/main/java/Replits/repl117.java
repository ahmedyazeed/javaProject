package Replits;

public class repl117 {

   static int sumEvenToX(int x) {
       int sum = 0;

       for (int i = 2; i <= x; i = i + 2) {

           sum = sum + i;

       }return sum;
   }

    public static void main(String[] args) {
        System.out.println(sumEvenToX(5));
    }}










