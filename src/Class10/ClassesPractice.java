package Class10;

public class ClassesPractice {

    public static void main(String[] args) {

        String name="User123";
        String pass="Pass123";
        String confirmpass="Pass123";

        if (name.isEmpty()||pass.isEmpty()){
            System.out.println("name or pass cannot be empty");}
            else if (pass.length()<8){
                System.out.println("Pass is too short");}
            else if (pass.contains(name)) {
            System.out.println("Pass and name cannot be the same");}

        else if (!pass.equals(confirmpass)) {
            System.out.println("first pass is different than the second pass");}



    }}