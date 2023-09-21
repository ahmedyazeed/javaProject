package GroupExercise2;

/*Count the Number of Words in a String: Write a function to count the
        number of words in a given string. Words are separated by spaces or
        punctuation. For example, the input "Hello, world!" should return 2.*/
public class GE4 {
    String countingMethod(String words){
       String []arr=words.split(" ");
        System.out.println(arr.length);

        return words;
    }
    public static void main(String[] args) {
        GE4 obj=new GE4();
        obj.countingMethod("Hello, world!");
    }
}
