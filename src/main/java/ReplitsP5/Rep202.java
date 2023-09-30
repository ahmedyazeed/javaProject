package ReplitsP5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Rep202 {
    public static void main(String[] args) {
        Map<String,String> map=new LinkedHashMap<>();
        map.put("1 item" , "apple");
        map.put("2 item" , "banana");
        map.put("3 item" , "pear");
        map.put("4 item" , "tomato");
        map.put("5 item" , "mango");
        map.put("6 item" , "kiwi");

        map.forEach((k,v)-> System.out.println("Key is "+k+" and values is "+v));
    }
}
