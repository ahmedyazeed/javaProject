package Class11;

public class E6StringMethonds {
    public static void main(String[] args) {


        String str = "oijqowiehoHH:LKLI6543a";

        System.out.println(str.replaceAll("[A-Z]","="));
        System.out.println(str.replaceAll("[A-C]","="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]","="));
        System.out.println(str.replaceAll("[0-9]",""));


    }}