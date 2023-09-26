package ReplitsP4;

import java.util.ArrayList;

public class Rep191 {
    public static void main(String[] args) {
        ArrayList <Boolean> listA = new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);
        for (int i = 0; i < listA.size(); i++) {
            ArrayList<Boolean> listB = new ArrayList<>();
            listB.add(listA.get(i));
            for (Boolean element : listB) {
                System.out.println(element);

            }

        }


    }
}
