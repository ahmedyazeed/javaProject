package ReplitsP2;

public class Replits146 {
   private String name;
    private  String lastName;
    private int employeeId;
    private String startDate;
    private int salary;

    public Replits146(){}

    public Replits146(String name, String lastName, int employeeId, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
    }
    public static void main(String[] args) {
        Replits146 obj1=new Replits146();
        obj1.displayInfo();
        Replits146 obj2=new Replits146("Joe","Smith",12345,"01/01/1970",35000);
        obj2.displayInfo();


    }
}





