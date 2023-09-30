package ReplitsP5;

import java.util.HashMap;
import java.util.Map;

public class Rep208 {
  public static void display(Map<String, Integer> map){
      if (map.isEmpty()){
          System.out.println("map is empty");
      }
      else {
         map.forEach((k,v)-> System.out.println(k+" : "+v));
      }

  }
    public static void main(String[] args) {
        Map<String,Integer> mapList=new HashMap<>();
        mapList.put("mango", 10);

        mapList.put("apple", 30);

        mapList.put("orange", 20);

        Rep208.display(mapList);
        mapList.clear();
        Rep208.display(mapList);


    }
}