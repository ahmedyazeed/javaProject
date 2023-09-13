package ReplitsPart2;
 class Main extends Replits151 {
     public static void main(String[] args) {

     int[][] a = {

             {1, 2, 3},

             {4, 5, 6},

             {7, 8, 9}};
         System.out.println(sum2D(a));

}

}
public class Replits151 {

     public static int sum2D(int [][]arr) {
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 sum = sum+ arr[i][j];
             }
         }
         return sum;
     }}
