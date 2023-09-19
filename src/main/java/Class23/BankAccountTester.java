package Class23;

public class BankAccountTester {

    public static void main(String[] args) {BankAccount b=new BankAccount("Marta",
            1252202152,160000,"User123","Pass123","Checking");
        System.out.println(b.getName());
        System.out.println(b.getBankAccountNum());
        b.setName("Shawn");
        System.out.println(b.getName());

    }

}
