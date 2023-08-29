package Class9;

public class task2DArrays {
    public static void main(String[] args) {



        int [][] numbers={
                {10,20,30,40},
                {15,30,35,45},
                {16,20,32,22}};

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col <4 ; col++) {
                if (numbers[row][col]%2==0) // to get the even number
                System.out.print(numbers[row][col]+" ");
                
            }
            System.out.println();
            
        }

      
        





    }
}
