package ReplitsPart1;

 class Main {
     String carColor;
     int carYear;
     String carMake;

     void carColor(){
         System.out.print("Car color is ");
     }
     void carYear(){System.out.print(" and Car year is ");}
     void carMake(){System.out.print(" and Car make is ");}

     public static void main(String[] args) {

         Main BMWobj = new Main();
         BMWobj.carColor="Black";
         BMWobj.carYear=2019;
         BMWobj.carMake="BMW";

         BMWobj.carColor();
         System.out.print(BMWobj.carColor);
         BMWobj.carYear();
         System.out.print(BMWobj.carYear);
         BMWobj.carMake();
         System.out.println(BMWobj.carMake);



         Main Toyotaobj = new Main();
         Toyotaobj.carColor="White";
         Toyotaobj.carYear=2018;
         Toyotaobj.carMake="Toyota";

         Toyotaobj.carColor();
         System.out.print(Toyotaobj.carColor);
         Toyotaobj.carYear();
         System.out.print(Toyotaobj.carYear);
         Toyotaobj.carMake();
         System.out.print(Toyotaobj.carMake);






     }}
