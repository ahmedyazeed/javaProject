package ReplitsP2;

public class Repl159 {
    int num1;
    int num2;
    int num3;
    int num4;

    void sub(int num1, int num2){
        System.out.println(num1-num2+" (should come from subtracting 2 numbers)");

    }
    void sub(int num1, int num2,int num3){
        System.out.println(num1-num2-num3+" (should come from subtracting 3 numbers)");
    }

    void sub(int num1, int num2, int num3,int num4){
        System.out.println(num1-num2-num3-num4+" (should come from subtracting 4 numbers)");
    }

    public static void main(String[] args) {


        Repl159 obj1=new Repl159();
        obj1.sub(130,30,30,30);
        Repl159 obj2=new Repl159();
        obj2.sub(90,30,30);
        Repl159 obj3=new Repl159();
        obj3.sub(40,20);

    }

}