package ReplitsP2;

public class Replits140 {
    public static String maxLength(String [] arr){
        String longestWord="0";
      for (String word:arr){
          if (word.length()>longestWord.length()){longestWord=word;
          }    }
        return longestWord;
      }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));

    }
}



