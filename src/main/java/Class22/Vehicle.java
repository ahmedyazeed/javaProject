package Class22;

public interface Vehicle {

    void drive();
}
interface Bike extends Vehicle{
    void applyBreaks();
}
class HondaBike implements Bike{

    public void drive() {
        System.out.println("driving....");

    }
    public void applyBreaks() {
        System.out.println("stop......");

    }
}
