package Class20;

public class TaskStudent {


        public void eat(){System.out.println("Student can eat");}
        public void speak(){System.out.println("Student can speak");}
        public void sleep(){System.out.println("Student can sleep");}

}
 class SyntaxStudent extends TaskStudent {
     @Override
     public void eat() {
         System.out.println("Student on diet");

     }
 }
class CollegeStudent extends TaskStudent {
    @Override
    public void speak() {
        System.out.println("Student is on doing the class");
    }
}
class SchoolStudent extends TaskStudent {
    @Override
    public void sleep() {
        System.out.println("Student will stay awake");

    }
}
