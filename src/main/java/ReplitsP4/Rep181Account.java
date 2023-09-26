package ReplitsP4;

public class Rep181Account {
    long accNo;
String name;
String email;
 double amount;

    public long getAccNo() {
        System.out.print(accNo);
       return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        System.out.print(" "+name+" ");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        System.out.print(email+" ");
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        System.out.println(amount);
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        Rep181Account obj=new Rep181Account();
        obj.setAccNo(7560504000l);
        obj.setName("Sumair");
        obj.setEmail("sumair@syntax.com");
        obj.setAmount(50000);
        obj.getAccNo();
        obj.getName();
        obj.getEmail();
        obj.getAmount();

    }
}

