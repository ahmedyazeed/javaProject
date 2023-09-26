package Class26;


import java.util.TreeMap;

public class T2MapsAnotherWay {
    public static void main(String[] args) {

        TreeMap<String,String> countries=new TreeMap();
        countries.put("Afghanistan","Kabul");
        countries.put("Belarus","Minsk");
        countries.put("Cuba","Havana");
        countries.put("Belgium","Brussels");
        countries.put("Brazil","Brasilia");
        countries.put("Colombia","Bogota");
        //countries.forEach((k,v)-> System.out.println(k+" "+v));
        countries.forEach((k,v)->{if (k.length()>5){
            System.out.println(k+" "+v);}
        });



        }
    }