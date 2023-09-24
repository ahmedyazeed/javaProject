package ReplitsP3;

public class Rep180 {



    private String empName="John";

    private int empAge=30;

    public String getEmpName() {
        System.out.println("Employee Name: "+empName);
        return empName;
    }

    public int getEmpAge() {
        System.out.println("Employee Age: "+empAge);
        return empAge;
    }

    public static void main(String[] args) {
        Rep180 emp=new Rep180();
      emp.getEmpName();
      emp.getEmpAge();

    }

}
