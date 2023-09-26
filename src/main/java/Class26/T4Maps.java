package Class26;

import java.util.LinkedHashMap;

public class T4Maps {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> BestBuyStore=new LinkedHashMap<>();
        BestBuyStore.put(7664847,"Printer");
        BestBuyStore.put(7879885,"TV");
   /* *//*    BestBuyStore.forEach((x,y)->{
            System.out.println(x+" "+y);*//*
            
        });*/
        var entries=BestBuyStore.entrySet();
        for(var e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    }

