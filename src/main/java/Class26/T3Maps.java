package Class26;
/*
Create a map of countries(5) with its capital that will store countries in alphabetical order.
Country names will be keys and capitals will be values
Only print those countries which contain more than 5 letters in their country
name and the letter 'a' in their capital names
 */

import java.util.TreeMap;

public class T3Maps {
    public static void main(String[] args) {

        TreeMap<String,String> countries=new TreeMap();
        countries.put("Afghanistan","Kabul");
        countries.put("Belarus","Minsk");
        countries.put("Cuba","Havana");
        countries.put("Belgium","Brussels");
        countries.put("Brazil","Brasilia");
        countries.put("Colombia","Bogota");
        //countries.forEach((k,v)-> System.out.println(k+" "+v));
        countries.forEach((k,v)->{if (k.length()>5&&v.contains("a")){
            System.out.println(k+" "+v);}
        });



        }
    }