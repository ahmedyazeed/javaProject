package ReplitsP4;

import java.util.LinkedList;

public class Rep189 {
    public static void main(String[] args) {
        LinkedList<Integer> objs=new LinkedList<>();

        for(int i=50; i<=100;i++){objs.add(i);}
        objs.removeIf(x->x%3!=0);

        System.out.println(objs);




    }
}
