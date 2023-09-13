package ReplitsPart2;



public class Replits169 {


    public final static double avgElements(int[] arr) {   double avg=0;
        double sum=0;
        for (int i = 0; i < arr.length; i++) {

             sum = sum+arr[i];
             avg = sum / arr.length;



        }  System.out.println(avg);
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 8, 4};
        avgElements(arr);
    }
}