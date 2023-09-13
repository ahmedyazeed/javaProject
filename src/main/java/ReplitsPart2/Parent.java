package ReplitsPart2;

public class Parent {

   public Parent(){
       System.out.println("Parent Constructor without argument");
   }
    public Parent(int number){
        System.out.println(number);
    }

}
class Child extends Parent {


    public Child(){
        super();
        System.out.println("Child Constructor without argument");
    }


}

