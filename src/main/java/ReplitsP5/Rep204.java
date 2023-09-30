package ReplitsP5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Rep204 {
    public static void main(String[] args) {
        Map<String,String> map=new LinkedHashMap<>();
        map.put("Street" , "Patrick ST");
        map.put("Suite" , "265");
        map.put("City" , "Vienna");
        map.put("Zip" , "22180");
        map.put("Country" , "United State");
        map.forEach((k,v)-> System.out.println(v));
    }
}
