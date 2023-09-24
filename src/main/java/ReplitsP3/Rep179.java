package ReplitsP3;

public class Rep179 {
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
class Rep179Tester{
    public static void main(String[] args) {
        Rep179 employee=new Rep179();
        employee.setEmpName("Mario");
        employee.setEmpAge(32);
        employee.getEmpName();
        employee.getEmpAge();

    }
}
