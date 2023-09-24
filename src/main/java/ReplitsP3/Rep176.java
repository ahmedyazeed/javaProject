package ReplitsP3;

 interface Rep176 {


    void parentMethod();



}
interface ChildInterface extends Rep176 {

    void childMethod();


}

class Rep176Tester implements ChildInterface {
    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");

    }

    @Override
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");

    }

    public static void main(String[] args) {
        Rep176Tester obj=new Rep176Tester();
        obj.parentMethod();
        obj.childMethod();
    }


}
