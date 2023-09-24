package ReplitsP2;

public class Replits122 {
    String countryName;
    String capital;
    int pop;

    void displayValues()
    {
        System.out.println("The capital of "+countryName+" is "+capital+" and population is "+pop);
    }

    public static void main(String[] args) {
        Replits122  obj1=new Replits122();
        obj1.countryName="USA";
        obj1.capital="Washington DC";
        obj1.pop=330000000;

        Replits122  obj2=new Replits122();
        obj2.countryName="Kazakhstan";
        obj2.capital="Astana";
        obj2.pop=18500000;

        obj1.displayValues();
        obj2.displayValues();

    }

}