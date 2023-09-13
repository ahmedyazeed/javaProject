package ReplitsPart2;

public class Rep162 {public static void staticMethod() {
    System.out.println("static method without parameter");
}


    public static void staticMethod(int num) {
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {

        Rep162.staticMethod();
        Rep162.staticMethod(10);
    }
}