package ReplitsPart1;

public class reptest3 {
    int empID;
    double salary;
   static String CEO="Sumair";

   void inforPrint() {
       System.out.println(empID + " " + salary + " " + CEO);
   }

    public static void main(String[] args) {

    reptest3 ob1=new reptest3();
    ob1.empID=1012;
    ob1.salary=1500.99;
        reptest3 ob2=new reptest3();
        ob2.empID=1020;
        ob2.salary=1900.99;



    ob1.inforPrint();
    ob2.inforPrint();






    }
}