package ReplitsP6;

class SyntaxStudentException extends RuntimeException {
    public SyntaxStudentException(String message) {

    }
}

public class Rep214 {
    public static void gradeCheck(int studentGrade) {
        if (studentGrade > 90) {
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        } else {
            System.out.println("You are a great student");
        }
    }

    public static void main(String[] args) {
        try {

            gradeCheck(100);
        } catch (SyntaxStudentException s) {
            System.out.println(s+": You are an exceptionally awesome student");
        }
    }
}