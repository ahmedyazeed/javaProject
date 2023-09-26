package ReplitsP4;

import java.util.LinkedList;

public class Rep190 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        for (int i = 0; i < 10; i++) {
            LinkedList<Integer>nums=new LinkedList<>();
            nums.add(a);
            int temp = a;
            a = b;
            b = temp + b;
            for (Integer num : nums) {
                System.out.print(num+" ");

            }
        }
    }
}