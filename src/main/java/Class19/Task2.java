package Class19;

public class Task2 {

    static void method(){
        System.out.println("method overloaded empty static");}
    static void method(String s){
        System.out.println("method overloaded String static");}
static void method(int i){
        System.out.println("method overloaded int static");}
    public static void main(String[] args) {
        new Task2();
        method();
        method("Ahmed");
        method(100);}}
