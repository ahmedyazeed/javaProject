package ReplitsPart2;

public class Replits142 {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;
    Replits142() {}

    public Replits142(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }
    void diplayValues(){System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
}

    public static void main(String[] args) {

        Replits142 obj=new Replits142();
        obj.diplayValues();

        Replits142 obj2=new Replits142("Syntax",6,2020,"07/30/2020");
        obj2.diplayValues();

    }}