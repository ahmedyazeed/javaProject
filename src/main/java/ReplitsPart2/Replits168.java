package ReplitsPart2;

public class Replits168 {
   static final void rev(String word){

        for (int i = word.length()-1; i >=0; i--) {

            System.out.print(word.charAt(i));
        }
    }
    public static void main(String[] args) {

      rev("hello");
    }

    }


