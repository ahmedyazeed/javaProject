package GroupExercise2;
public class GE2 {
    /*Reverse a String: Write a function to reverse a given string. For
    example, given the input "Hello", the output should be "olleH"*/
    public void reversedString(String s) {

        for (int i = s.length()-1; i >= 0; i--) {

            System.out.print(s.charAt(i));
        }
    }
        public static void main (String[]args){
            GE2 word = new GE2();
            word.reversedString("Hello");
        }
    }