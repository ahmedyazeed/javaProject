package reviewClasses;

class Review09212023 {

        void speak(){
            System.out.println("Animals speak");
        }
        void eat(){
            System.out.println("Animals eat");
        }
    }
    class Dog extends Review09212023{
        @Override
        void speak() {
            System.out.println("wuff wuff ");
        }

        @Override
        void eat() {
            System.out.println("Dogs like to eat bones");
        }
    }
    class Cat extends Review09212023{
        @Override
        void speak() {
            System.out.println("meow");
        }

        @Override
        void eat() {
            System.out.println("Cats like fish");
        }
     public static void main(String[] args) {
         Review09212023[] arr = {new Review09212023(), new Cat(), new Dog()};
         for (Review09212023 a : arr) {
             a.eat();
             a.speak();
         }
         



     }}


