package Class20;

public class E4TypesCasting {
    public static void main(String[] args) {

        int num=(int)12.5;
        System.out.println(num);
        double age=10;

        Animal a=new Dog();
        Dog d=(Dog) new Animal();

    }
}
