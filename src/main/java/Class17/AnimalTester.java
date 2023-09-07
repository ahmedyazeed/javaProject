package Class17;

public class AnimalTester {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.name="Tom";
        c.breed="Russian";
        c.color="White";
        c.age=8;
        c.Attitude=true;
        c.printInfo();

        Dog d=new Dog();
        d.name="Jacky";
        d.breed="German";
        d.color="Brown";
        d.age=8;
        d.printInfo();

        Animal a=new Animal();
        a.name="Jim";
        a.breed="bewbew";
        a.color="Black";
        a.age=7;
        a.printInfo();

    }
}
