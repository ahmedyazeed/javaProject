package GroupExercise2;

public class GE6 {

   /* Find the First Non-Repeating Character in a String: Given a string,
    find and return the first non-repeating character. For example, in the
    string "abracadabra", the first non-repeating character is 'c'.*/
   public static char findFirstNonRepeatingChar(String str) {
       for (char currentChar : str.toCharArray()) {
           int count = 0;
           for (char c : str.toCharArray()) {
               if (currentChar == c) {
                   count++;
               }
           }
           if (count == 1) {
               return currentChar;
           }
       }
       return 0;
   }
    public static void main(String[] args) {

        char firstNonRepChar = findFirstNonRepeatingChar("abracadabra");
        if (firstNonRepChar != 0) {
            System.out.println("The first non-repeating character is: " + firstNonRepChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}