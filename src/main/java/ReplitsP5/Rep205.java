package ReplitsP5;

import java.util.*;

public class Rep205 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Street" , "Patrick ST");
        map.put("Suite" , "265");
        map.put("City" , "Vienna");
        map.put("Zip" , "22180");
        map.put("Country" , "United State");

       List<String> mapValues=new ArrayList<>(map.values());
       mapValues.forEach(x-> System.out.println(x.toUpperCase()));




    }
}
