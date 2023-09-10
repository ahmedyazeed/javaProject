package Class20;

public class E3TypesCasting {
    public static void main(String[] args) {
       /* Student s1=new Student("Aslan","A123");
        Student s2=new Student("Mikhail","12345");

        */

        //Student [] arr={s1,s2};
        //or
        Student []arr={new Student("Aslan","A123"),new Student("Mikhail","12345")};
        //arr[1].printInfo();

        for (int i = 0; i < arr.length ; i++) {
            Student s=arr[i];
            s.printInfo();

        }

    }
}
