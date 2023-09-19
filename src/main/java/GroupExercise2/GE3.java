package GroupExercise2;

public class GE3 {

    String isPalindromMethod(String str) {
        char word=0;
        char newWord = 0;
        for (int i = 0; i < str.length(); i++) {
             word = str.charAt(i);}

            for (int j = str.length()-1; j >=0; j--) {
                 newWord=str.charAt(j);
            }

            if (word==newWord){
                System.out.println(str+" is palindrome");}
            else {System.out.println(str+" is not palindrome");}

        return str;
    }

    public static void main(String[] args) {
        GE3 obj=new GE3();
        obj.isPalindromMethod("madam");
    }
}
