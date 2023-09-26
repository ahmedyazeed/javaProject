package ReplitsP4;

import java.util.LinkedList;

public class Rep193 {
    public static void main(String[] args) {
        LinkedList<Integer> nums=new LinkedList<>();

        nums.add(111);
        nums.add(222);
        nums.add(333);
        nums.add(444);
        nums.add(555);
        nums.add(666);
        int sum=0;
        for (int i = 0; i < nums.size(); i++) {

            sum=nums.get(i)+sum;

        }
        System.out.println("Result of sum is "+sum);

        }





    }

