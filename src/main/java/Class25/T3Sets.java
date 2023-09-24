package Class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class T3Sets {
    public static void main(String[] args) {

        List<String> cities=new ArrayList<>();
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Addis Ababa");
        cities.add("Adelaide");
        cities.add("Philadelphia");
        cities.add("Cairo");

        System.out.println("Original String was: "+cities);
        cities.removeIf(x->x.startsWith("A"));

        LinkedHashSet citiesSorted=new LinkedHashSet(cities);

        System.out.println("String after insertion kept: "+cities);

        System.out.println("String after cities start with A removed: "+citiesSorted);






    }
}
