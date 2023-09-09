package Class19;

public class AX extends CreditCard {


    @Override
    public void calcMethod(double balance) {
        System.out.println(balance*0.07);
    }

    public static void main(String[] args) {


       AX obj1=new AX();
        obj1.calcMethod(100);

        CreditCard obj2=new CreditCard();
        obj2.calcMethod(100);

        Visa obj3=new Visa();
        obj3.calcMethod(100);


    }
}

