package ReplitsP4;

import java.util.ArrayList;

public class Rep187 {
    public static void main(String[] args) {
        ArrayList<String> objs=new ArrayList<>();
        objs.add("hi");
        objs.add("yo");
        objs.add("sup");
        objs.add("yolo");
        objs.add("boop");
        objs.remove("hi");
        objs.remove("sup");
        objs.remove("boop");

        System.out.print(objs.get(0)+" ");
        System.out.println(objs.get(1));

    }
}
