package ReplitsP3;

public abstract class Rep172 {

    void m2(){
        System.out.println("Parent class providing implementation");
    }
    abstract void m1();


}
class Child1 extends Rep172{

    @Override
    void m1() {
        System.out.println("Child class providing implementation");
    }

    public static void main(String[] args) {
        Child1 obj=new Child1();
        obj.m1();
        obj.m2();
    }
}
