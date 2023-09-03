package Class11;

public class tastStringMethods {
    public static void main(String[] args) {

        //Write code will count how many times the letter a has appeared in the following String

        String str="Batch 17 is great.";

   int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){count++;}

        }
        System.out.println(count);





    }

}
