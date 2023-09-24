package ReplitsP1;

public class Dog {


    String breed;
    String name;
    String color;

    void bark() {
        System.out.println(breed+" can bark");
    }

    void run() {
        System.out.println(breed+" can run");
    }

    void play() {
        System.out.println(breed+" can play");
    }

    public static void main(String[] args) {
        Dog Husky=new Dog();
        Husky.breed="Husky";


        Husky.bark();
        Husky.run();
        Husky.play();


        Dog Bulldog=new Dog();
        Bulldog.breed="Bulldog";
        Bulldog.bark();
        Bulldog.run();
        Bulldog.play();

        Dog Labrador=new Dog();
        Labrador.breed="Labrador";

        Labrador.bark();
        Labrador.run();
        Labrador.play();













    }


}
