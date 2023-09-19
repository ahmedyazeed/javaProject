package Class24;

import java.util.ArrayList;

public class RemoveIF {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Coffee");
        words.add("Tea");
        words.add("fzzy drink");
        words.add("Juice");
        words.add("mocmoc");

      /*  for (String x : words) {
            System.out.println(x);
        }*/
        words.forEach(x-> System.out.println(x+" "));

        words.removeIf(x->x.contains("e"));
        System.out.println(words);



    }
}