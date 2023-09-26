package ReplitsP4;

import java.util.HashSet;

public class Rep195 {
    public static void main(String[] args) {
        HashSet<Integer> objs=new HashSet<>();

        objs.add(111);
        objs.add(111);
        objs.add(111);
        objs.add(999);
        objs.add(999);
        objs.add(999);

        for (Integer obj : objs) {
            System.out.println(obj);

        }


    }
}
