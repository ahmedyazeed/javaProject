package ReplitsP2;

public class Replits144 {
   private String dogName;
    private double dogWeight;
    static String dogBreed="Mutt";

    public Replits144(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }
    public void printDetails(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
}

    public static void main(String[] args) {
        Replits144 dog1=new Replits144("Tarzan",50);
        dog1.printDetails();
        Replits144 dog2=new Replits144("Lucy",10);
        dog2.printDetails();
    }
}





