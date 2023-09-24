package Class25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class T1Sets {
    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        HashSet<String> aFilteredList=new HashSet<>(aList);//removed the duplication using HashSet
        aList.clear();
        aList.addAll(aFilteredList);
        System.out.println(aList);

    }
}
