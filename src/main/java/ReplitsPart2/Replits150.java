package ReplitsPart2;

class Replits150 {
     String firstName;
     String lastName;
     int age;



    public void printInfo(String firstName,String lastName,int age) {
        System.out.println(firstName + " " + lastName + " " + age);
    }}

class Employee extends Replits150 {
     int salary;

    public void printInfo(String firstName,String lastName,int age,int salary) {
        System.out.println(firstName + " " + lastName + " " + age+" "+salary);
    }
}
class Tester extends Employee {
     String programmingLang;

    public  void printInfo(String firstName,String lastName,int age,String programmingLang) {
        System.out.println(firstName + " " + lastName + " " + age+" "+programmingLang);
    }}



