package ReplitsP2;

public class replits134 {
    public static int countVowels(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e'|| c == 'o'|| c == 'u'|| c == 'i') {
                count++;
            }
        }

        return count;
    }


    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends"));
    }
}









