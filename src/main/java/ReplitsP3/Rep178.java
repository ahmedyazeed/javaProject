package ReplitsP3;

public class Rep178 {

    private String empName;
    private int empAge;

    public String getEmpName() {
        System.out.println("Employee Name: "+empName);
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        System.out.println("Employee Age: "+empAge);;
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}
class Rep178Tester{
    public static void main(String[] args) {
        Rep178 employee=new Rep178();
        employee.setEmpName("John");
        employee.setEmpAge(30);
        employee.getEmpName();
        employee.getEmpAge();

    }
}
