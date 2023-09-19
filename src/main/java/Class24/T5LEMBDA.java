package Class24;

import java.util.ArrayList;

public class T5LEMBDA {
    public static void main(String[] args) {

        ArrayList<String> fruits=new ArrayList<>();
       fruits.add("Banana");
       fruits.add("Coco");
       fruits.add("Strawberry");
       fruits.add("Mango");
       fruits.add("Pineapple");
        System.out.println(fruits);
       fruits.removeIf(x->x.contains("a")||x.endsWith("e"));
        System.out.println(fruits);

        }


            }


/*
        nums.forEach(x-> System.out.println(x+" "));

        nums.removeIf(x->x.contains("e"));
        System.out.println(nums);*/



