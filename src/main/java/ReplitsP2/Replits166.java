package ReplitsP2;

 class Replits166 {
     String type;

    public Replits166(String type) {
        this.type = type;
    }
   public void eat(){
        System.out.println(type+" eats");
    }
   public void sleep(){
        System.out.println(type+" sleeps");
    }

}
class Cat extends Replits166 {


    public Cat(String type) {
       super(type);
    }
    public void sleep(){
        System.out.println(type+" sleeps a lot");
    }
}
class Kitten1 extends Cat{

    public Kitten1(String type) {

        super(type);
    }
   public void eat(){
        System.out.println(type+" eats milk");
    }
}
class Kitten2 extends Cat{
    public Kitten2(String type) {
        super(type);
    }
    public void eat(){
        System.out.println(type+" eats snacks");
    }
}
class Kitten3 extends Cat{
    public Kitten3(String type) {
        super(type);
    }
    public void eat(){
        System.out.println(type+" eats everything");
    }

    public static void main(String[] args) {
        Replits166[] animalarray={new Cat("Cat"),new Kitten1("Kitten1"),
                new Kitten2("Kitten2"),new Kitten3("Kitten3")};
        for (Replits166 animal : animalarray) {
            animal.eat();
            animal.sleep();

        }
      /*  Cat c=new Cat("Cat");
        c.eat();
        c.sleep();

        Kitten1 k1=new Kitten1("Kitten1");
        k1.eat();
        k1.sleep();

        Kitten2 k2=new Kitten2("Kitten2");
        k2.eat();
        k2.sleep();

        Kitten3 k3=new Kitten3("Kitten3");
        k3.eat();
        k3.sleep();*/


    }
}
