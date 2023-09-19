package Class24;

import java.util.ArrayList;

public class TaskE4ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(25);
        nums.add(100);
        nums.add(5);
        System.out.println(nums);

        int sum=0;
        for (Integer n:nums){
            if (n>20)
            sum=sum+n;}
            System.out.println(sum);

        }
    }



