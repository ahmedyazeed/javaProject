package GroupExercise2;
/*Create a Class Car that would have the following fields: carPrice and
        color and method calculateSalePrice() which should be returning a
        price of the car.
        Create 2 sub classes: Sedan and Truck. The Truck class has a field
        as weight and has its own implementation of calculateSalePrice()
        method in which returned price is calculated as following: if
        weight>2000 then returned price car should include 10% discount,
        otherwise 20% discount.
        The Sedan class has field as length and also does it is own
        implementation of calculateSalePrice(): if length of sedan is >20 feet
        then returned car price should include 5% discount, otherwise 10%
        discount*/
public class GE11Car {
    double carPrice;
    String color;

    double calculateSalePrice(double carPrice,String color){

        return carPrice;
    }
}
class Truck extends GE11Car {
    double weight;


    double calculateSalePrice(double carPrice, String color,double weight) {

        this.weight=weight;

        double TruckPriceAfterSmallDiscount;
        double TruckPriceAfterBigDiscount;
        TruckPriceAfterSmallDiscount=carPrice*0.1+carPrice;
        TruckPriceAfterBigDiscount=carPrice*0.2+carPrice;
        if (weight>2000){
            return TruckPriceAfterSmallDiscount;

    }


      else return TruckPriceAfterBigDiscount;
    }
static class Sedan extends GE11Car {
    double length;
    double SedanPriceAfterSmallDiscount;
    double SedanPriceAfterBigDiscount;
    double calculateSalePrice(double carPrice,String color,double length) {
        this.length=length;
    SedanPriceAfterSmallDiscount=carPrice*0.05+carPrice;
    SedanPriceAfterBigDiscount=carPrice*0.1+carPrice;
        if (length>20){return SedanPriceAfterSmallDiscount;

    }
      else return SedanPriceAfterBigDiscount;
}}

    public static void main(String[] args) {
        Truck Truck=new Truck();
        System.out.println(Truck.calculateSalePrice(1000,"blue",1500));

        Sedan Sedan=new Sedan();
        System.out.println( Sedan.calculateSalePrice(1000,"Red",10));

    }
    }
