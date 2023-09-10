package ReplitsPart2;

public class Replits145 {
   private String dogName;
    private double dogWeight;
    static String dogBreed="Mutt";

    public Replits145(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }
    public void printDetails(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
}

    public static void main(String[] args) {
        Replits145 dog1=new Replits145("Tarzan",50);
        dog1.printDetails();
        Replits145 dog2=new Replits145("Lucy",10);
        dog2.printDetails();
    }
}





