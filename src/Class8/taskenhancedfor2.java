package Class8;

public class taskenhancedfor2 {

    public static void main(String[] args) {


        int[] nums={10,77,25,56,60,20,-10,-5};
        int small=0;

        for (int n:nums)if (n<small){
            small=n;
            System.out.println(small);
        }

    }
}
