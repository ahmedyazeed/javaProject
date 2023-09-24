package ReplitsP3;

public interface Rep175 {

    void firstMethod();



}
    interface SecondInterface {

        void secondMethod();


    }

    class Rep175Tester implements Rep175,SecondInterface{

        @Override
        public void firstMethod() {
            System.out.println("First Method implementing multiple Inheritance");

        }

        @Override
        public void secondMethod() {
            System.out.println("Second Method implementing multiple Inheritance");

        }

        public static void main(String[] args) {
            Rep175Tester obj=new Rep175Tester();
            obj.firstMethod();
            obj.secondMethod();
        }
    }
