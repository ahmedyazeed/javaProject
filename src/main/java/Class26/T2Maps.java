package Class26;

import java.util.Map;
import java.util.TreeMap;

public class T2Maps {
    public static void main(String[] args) {

        TreeMap<String,String> countries=new TreeMap();
        countries.put("Afghanistan","Kabul");
        countries.put("Belarus","Minsk");
        countries.put("Cuba","Havana");
        countries.put("Belgium","Brussels");
        countries.put("Brazil","Brasilia");
        countries.put("Colombia","Bogota");

        for (Map.Entry<String, String> countryWithCapital : countries.entrySet()) {
            System.out.println(countryWithCapital);

        }

        }
    }