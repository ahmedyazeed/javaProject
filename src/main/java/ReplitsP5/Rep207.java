package ReplitsP5;

import java.util.HashMap;
import java.util.Map;
public class Rep207 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();

        map.put("ONE","AAA");

        map.put("TWO","BBB");

        map.put("THREE","CCC");

        map.put("FOUR","DDD");

        map.put("FIVE","EEE");

        System.out.println("HashMap Before Replace :");
        map.forEach((k,v)-> System.out.println(k+" : "+v));

        System.out.println("------------------");

        map.replace("THREE","ASEL");
        map.replace("FIVE","SUMAIR");

        System.out.println("HashMap After Replace :");
        map.forEach((k,v)-> System.out.println(k+" : "+v));
    }
}
