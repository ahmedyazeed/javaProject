package ReplitsP3;

public interface Rep174 {

    void method1();
    void method2();


}
class Child2 implements Rep174 {

    @Override
    public void method1() {
        System.out.println("implementation of method1");

    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");

    }

    public static void main(String[] args) {
        Child2 obj=new Child2();
        obj.method1();
        obj.method2();
    }
}
