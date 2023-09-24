package ReplitsP2;

public class Replits143 {
   private String make;
    private  String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;
    public Replits143(String make, String model, int numberOfDoors,int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Replits143(String make, String model, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    public Replits143(int numberOfDoors, int topSpeed, double price) {
        this.make = "unknown";
        this.model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
}
    public Replits143(String make, String model) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = 4;
        this.topSpeed = 90;
        this.price = 0;


}
void displayInfo(){
    System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
}
    public static void main(String[] args) {
        Replits143   car=new Replits143("Toyota","Prius", 4, 120, 30000.0);
        car.displayInfo();
        Replits143   car2=new Replits143("Toyota","Prius", 120, 30000.0);
        car2.displayInfo();
        Replits143   car3=new Replits143(4, 120, 30000.0);
        car3.displayInfo();
        Replits143   car4=new Replits143("Toyota","Prius", 4, 90,0);
        car4.displayInfo();


    }

}



