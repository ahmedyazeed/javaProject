package ReplitsP2;



public class Replits170 {


    boolean b;
    String s;
    final static void method1(boolean b){
        System.out.println("Final method with boolean parameter");
    }
    final static void method2( String s){
        System.out.println("Final method with String parameter");
    }

    public static void main(String[] args) {
        method1(true);
        method2("s");
    }

}