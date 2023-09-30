package ReplitsP5;

import java.util.HashMap;
import java.util.Map;

public class Rep209 {
    public static Map<String, Integer> removeValues(Map<String, Integer> map) {
        map.entrySet().removeIf(entry -> entry.getValue() > 15);
    return map;
    }
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();

        map.put("mango", 10);

        map.put("apple", 30);

        map.put("orange", 20);

       Rep209.removeValues(map);
        System.out.println(map);


    }
}