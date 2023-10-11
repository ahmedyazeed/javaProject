package ReplitsP6;

public class Rep213 {
    static void temperatureCheck(int temp) throws RuntimeException {
        if (temp < 32) {
            throw new RuntimeException("It is freezing");
        }
    }
    public static void main(String[] args) {

        try {
            int tempInput=28;
            temperatureCheck(tempInput);
        }catch (RuntimeException r){
            System.out.println(r);
        }
}
    }




