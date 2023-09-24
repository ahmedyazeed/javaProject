package Class25;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class T2Sets {
    public static void main(String[] args) {

        List<String> countries=new ArrayList<>();
        countries.add("Palestine");
        countries.add("Iraq");
        countries.add("China ");
        countries.add("USA");
        countries.add("Egypt");
        countries.add("India");
        countries.add("Jordan");
        countries.add("Pakistan");
        countries.add("Afghanistan");
        countries.add("Syria");
        System.out.println(countries);
        for (String country : countries) {
            System.out.print(country+" ");

        }
        System.out.println();

        TreeSet<String> aFilteredList=new TreeSet<>(countries);
        countries.clear();
        countries.addAll(aFilteredList);
        System.out.println(countries);



    }
}
