package ReplitsP3;

public abstract class Rep173 {
    String teaType;

    public Rep173(String teaType) {
        this.teaType = teaType;
    }
   abstract void addSugar();
}

class LemonTea extends Rep173 {
    public LemonTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 2 spoons of sugar");

    }
}
class ChaiTea extends Rep173 {
    public ChaiTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 1 spoon of sugar");

    }

    public static void main(String[] args) {

        LemonTea drink1=new LemonTea("Lemon Tea");
        drink1.addSugar();
        ChaiTea drink2=new ChaiTea("Chai Tea");
        drink2.addSugar();
    }
}
