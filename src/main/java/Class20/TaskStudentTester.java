package Class20;

public class TaskStudentTester {

    public static void main(String[] args) {
        TaskStudent [] arr={new TaskStudent(),new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for (TaskStudent student:arr){
            student.eat();
            student.sleep();
            student.speak();
        }
    }
}
