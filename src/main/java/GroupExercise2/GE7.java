package GroupExercise2;

import java.util.ArrayList;
/* You have a list of strings, and you want to keep only those that start
  with “A” and you want to return them in lower case"*/
public class GE7 {
    public static void filterAndPrintToLower(ArrayList<String> inputList) {
        for (String word : inputList) {
            if (word.startsWith("A") || word.startsWith("a")) {
                System.out.println(word.toLowerCase());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Avocado");
        fruit.add("Orange");
        fruit.add("Grapes");

        filterAndPrintToLower(fruit);
    }
}





