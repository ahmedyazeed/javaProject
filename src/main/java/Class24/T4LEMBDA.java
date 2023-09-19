package Class24;

import java.util.ArrayList;

public class T4LEMBDA {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 2; i <=500 ; i+=2) {

            nums.add(i);

        }

      nums.removeIf(x->x%5==0);
        System.out.println(nums);


            }

        }
/*
        nums.forEach(x-> System.out.println(x+" "));

        nums.removeIf(x->x.contains("e"));
        System.out.println(nums);*/



