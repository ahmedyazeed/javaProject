package Class25;

import java.util.LinkedList;

public class Cat {
    private  String name;
    private  String color;
    private   int age;

     public Cat(String name, String color, int age) {
         this.name = name;
         this.color = color;
         this.age = age;
     }


     public   void printInfo(){
         System.out.println("Cat Name is "+name);
         System.out.println("Cat color is "+color);
         System.out.println("Cat age is "+age);
     }

     public static void main(String[] args) {

         LinkedList<Cat> cats= new LinkedList<>();
         cats.add(new Cat("Cookie","White",1));
         cats.add(new Cat("Brownie","black",2));

       /*  Cat cat=cats.get(0);
         Cat cat2=cats.get(1);
         cat.printInfo();
         cat2.printInfo();*/

         //or

         /*for(Cat cat:cats){cat.printInfo();}*/

         //or
         cats.forEach(x-> x.printInfo());


     }


}
