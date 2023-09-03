package Class11;

public class taskE2StringMethods {
    public static void main(String[] args) {



        String str="Hello";


        for (int i = 0; i < str.length(); i++) {

        }
            //if (!str.isEmpty()) {      (we don't need to mention is emtpty here cuz
        // the below is also going to check if it's empty or not

                if (str.length() % 2!= 0&& str.length()>=3) {
                    int middle=str.length()/2;
                    System.out.println(str.charAt(middle));





            }

        }}