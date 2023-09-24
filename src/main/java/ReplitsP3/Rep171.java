package ReplitsP3;

public abstract class Rep171 {

     abstract void m1();
    abstract void m1(String str);

}
class Child extends Rep171{
    @Override
    void m1() {
        System.out.println("m1 without parameters");

    }

    @Override
    void m1(String str) {
        System.out.println("m1 method with parameter");

    }

    public static void main(String[] args) {
      Child obj= new Child();
      obj.m1();
      obj.m1("test");

    }
}
