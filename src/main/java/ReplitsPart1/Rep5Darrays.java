package ReplitsPart1;

public class Rep5Darrays {
    public static void main(String[] args) {

        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };

        int count = 0; // Initialize a counter for negative and odd elements

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int element = a[i][j];
                if (element < 0 && element % 2 != 0) {
                    count++;
                }
            }
        }

        // Print the total count of negative and odd elements
        System.out.println(count);
    }
}