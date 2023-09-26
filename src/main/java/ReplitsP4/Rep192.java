package ReplitsP4;

import java.util.LinkedList;

public class Rep192 {
    public static void main(String[] args) {
        LinkedList<Integer> primeList = new LinkedList<>();

        for (int num = 2; num <= 100; num++) {
            if (java.math.BigInteger.valueOf(num).isProbablePrime(100)) {
                primeList.add(num);
            }
        }

        System.out.println(primeList);
    }
}