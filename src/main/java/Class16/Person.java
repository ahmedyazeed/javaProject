package Class16;

public class Person {

    private String name;
    private int age;
    private double weight;
    private char gender;


    public Person(String pName, int pAge, double pWeight, char pGender) {
        name = pName;
        age = pAge;
        weight = pWeight;
        gender = pGender;


    }

    public void printInfo() {
        System.out.println(name + " " + age + " " + weight + " " + gender);
    }

}

