package ReplitsPart2;

public class Replits144 {
   private String label;
    private double price;
    private  String category;
    private boolean hasExpiration;
    private int stock;
    public Replits144(String label,  double price,String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
        this.price = price;

    }
    public Replits144(String label, boolean hasExpiration, int stock, double price) {
        this.label = label;
        this.category = "misc";
        this.hasExpiration = false;
        this.stock = stock;
        this.price = price;
    }
    public Replits144(String label, double price) {
        this.label = label;
        this.stock = 0;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }
    public static void main(String[] args) {

        Replits144 obj1=new Replits144("Eggs",3.0,"Produce",true,10);
        obj1.displayInfo();
        Replits144 obj2=new Replits144("Paper Towels",2.0,"misc",false,24);
        obj2.displayInfo();
        Replits144 obj3=new Replits144("Paper Towels",2.0,null,false,0);
        obj3.displayInfo();
    }
}





