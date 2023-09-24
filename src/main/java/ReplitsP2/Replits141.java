package ReplitsP2;

public class Replits141 {
    static int maxValue(int[]arr){
      int beggiestNum=0;
      for (int num:arr){if (num>beggiestNum){beggiestNum=num;

        }


        }
    return beggiestNum;

}
    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }}


