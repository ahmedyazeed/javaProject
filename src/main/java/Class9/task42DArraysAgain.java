package Class9;

public class task42DArraysAgain {
    public static void main(String[] args) {

        String[][] cars = {
                {"Ford", "Lincoln", "Tesla"},
                {"MB", "BMW", "Audi"},
                {"Hyundai", "KIA", "Genesis"},
                {"Ferrari", "Lam", "Fiat"}};

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[j][i] + " ");




            }
            System.out.println();
        }

    }}







