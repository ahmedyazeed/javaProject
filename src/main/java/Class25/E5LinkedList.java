package Class25;

import java.util.LinkedList;

public class E5LinkedList {
   public static void main(String[] args) {
        LinkedList<Dog> dogs=new LinkedList<>();
        dogs.add(new Dog("Jacky","Persion"));
        dogs.add(new Dog("Jim","German"));
        dogs.add(new Dog("Bul'ka","Lab"));

        //getting the obj stored on index 2 and storing it inside the d var
        Dog d=dogs.get(2);
        d.printInfo();


    }
    }

    class Dog{
        String name;
        String breed;

        public Dog(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }
        void printInfo(){
            System.out.println(name+" "+breed);
        }
    }