package ReplitsP5;

import java.util.HashMap;
import java.util.Map;

public class Rep203 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);

        map.forEach((k,v)-> System.out.println("Key = "+k+" and value = "+v));
    }
}
