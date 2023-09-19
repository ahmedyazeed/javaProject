package Class24;

import java.util.ArrayList;

public class T3ArrayList {

    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("fzzy drink");
        drinks.add("Juice");
        drinks.add("mocmoc");

        for (String drink : drinks) {
            if (!(drink.contains("e")||drink.contains("a"))){
                System.out.println(drink);}
            else System.out.println("Water");
            }

        }


    }

