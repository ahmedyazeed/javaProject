package GroupExercise2;

import java.util.Arrays;

/*Check if Two Strings are Anagrams: Given two strings, determine if
 they are anagrams, meaning they contain the same characters in a
 different order. For example, "listen" and "silent" are anagrams.*/
public class GE5 {

      public static void anagramMethod(String str1, String str2){

                char[] arr1 = str1.toCharArray();
                char[] arr2 = str2.toCharArray();

                Arrays.sort(arr1);
                Arrays.sort(arr2);

                boolean equal;
            equal = Arrays.equals(arr1, arr2);

            if (equal)
            {
                System.out.println(str1 + " and " + str2 + " are anagrams");
            }
            else
            {
                System.out.println(str1 + " and " + str2 + " are not anagrams");
            }
        }

        public static void main(String[] args) {

            anagramMethod("listen","silent");
        }
    }
