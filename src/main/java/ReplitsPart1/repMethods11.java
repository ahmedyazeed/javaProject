package ReplitsPart1;

public class repMethods11 {

 int num1;
 int num2;
    void multiplication() {System.out.println("Multiplication "+(num1*num2));}
    void addition() {System.out.println("Addition "+(num1+num2));}
    void subtraction() {System.out.println("Subtraction " +(num1-num2));}


        public static void main (String[]args){

            repMethods11 obj1 = new repMethods11();
            obj1.num1=3;
            obj1.num2=10;
            repMethods11 obj2 = new repMethods11();
            obj2.num1=20;
            obj2.num2=10;
            repMethods11 obj3 = new repMethods11();
            obj3.num1=30;
            obj3.num2=10;

            obj2.addition();

            obj1.multiplication();

            obj3.subtraction();



        }
    }
