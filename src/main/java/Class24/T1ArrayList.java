package Class24;

import java.util.ArrayList;

public class T1ArrayList {

    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Ahmed");
        names.add("Mark");
        names.add("John");
        names.add("Karim");
        names.add("Malik");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Ahmed"));
        System.out.println(names.size());
        System.out.println(names);
        for (String name : names) {
            System.out.print(name+" ");

        }


    }
}
