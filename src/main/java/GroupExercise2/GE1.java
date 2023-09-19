package GroupExercise2;

public class GE1 {
    public String swapStrings(String string1,String string2) {
        return string2+string1;
    }
    public static void main(String[] args) {
        GE1 obj = new GE1();
        System.out.println(obj.swapStrings("Ahmed", "Hassan "));
     /*  Another easy way below:
     String str1="Ahmed";
     String str2="Hassan ";
     str1=str2+str1;
     System.out.println(str1);*/

         /*  Another easy way below:
        ArrayList<String> words = new ArrayList<>();
        words.add("Ahmed");
        words.add("Hassan");
        words.add(0, words.get(1));
        words.remove(2);*/
    }}
