package GroupExercise2;

/* Write a Java Function that increments a string,
It should take the string of unknown length. Don't use regular
expressions.
Examples:
123 -> 124
53456 -> 53457
29 -> 30
Function signature:
string Increment (string str)*/
public class GE8 {

    public  String incrementMethod(String word){
        Integer character=new Integer(word);
        int wordInIntegerFormPlus1=character.intValue()+1;

        System.out.println(word+" -> "+wordInIntegerFormPlus1);
        return word;
    }
    public static void main(String[] args) {
        GE8 obj=new GE8();
        obj.incrementMethod("123");
        obj.incrementMethod("53456");
        obj.incrementMethod("29");

    }
}





