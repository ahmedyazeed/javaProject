package Class16;

public class Cat {
    private String hairColor;
    private String eyeColor;
    private  int age;
    private  char gender;
    private double weight;
    private double height;

     public Cat(String hairColor,String eyeColor,int age,char gender,double weight,  double height) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    } public Cat(){}
    public Cat(String hairColor) {
         this.hairColor = hairColor;}
    public Cat(String hairColor,String eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;}
    public Cat(String hairColor,String eyeColor,int age) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.age = age;}
    public Cat(String hairColor,String eyeColor,int age,char gender) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.age = age;
        this.gender = gender;}
    public Cat(String hairColor,String eyeColor,int age,char gender,double weight) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.age = age;
        this.gender = gender;
        this.weight = weight;}


    public void printInfo(){
        System.out.println(hairColor+" "+eyeColor+" "+age+" "+gender+" "+weight+" "+height);
    }


    }



