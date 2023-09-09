package Class19;

public class Masters extends Degree{

    void getPrerequisites(){

        System.out.println("Test");
}
    public static void main(String[] args) {
        Masters obj=new Masters();
        obj.getPrerequisites();
        Degree obj2=new Degree();
        obj2.getPrerequisites();
        Bachelors obj3=new Bachelors();
    }}

