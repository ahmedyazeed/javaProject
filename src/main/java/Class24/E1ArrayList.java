package Class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        ArrayList <String> names=new ArrayList<>();
        names.add("Deepali");
        names.add("Ahmed");
        names.add("Mike");
        names.add("John");
        names.add("Ali");
        names.remove(0);
        names.remove("Deepali");// another way for the previous line
        System.out.println(names);
        names.add(0,"Ehab");
        System.out.println(names);



    }
}
