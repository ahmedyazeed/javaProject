package Class7;

public class hwArrayLoop {
    public static void main(String[] args) {

        char[] chars = {'A', 'B', 'C', 'D'};

        System.out.println(chars[1]);

        char[] chars2 = new char[4];
        chars2[0] = 'A';
        chars2[1] = 'B';
        chars2[2] = 'C';
        chars2[3] = 'D';

        System.out.println(chars2[1]);


        String[] words = {"Java", " Saturday", " day", " coding", " is "};

        System.out.println(words[1] + words[4] + words[0] + words[3] + words[2]);

        String[] cars = {"BMW", "MB", "TY", "KIA", "Nis"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }
        System.out.println();


        String[] cars2 = {"BMW", "MB", "TY", "KIA", "Nis"};

        int i = 0;

        while (i >= 0 && i < cars2.length) {

            System.out.println(cars2[i]);
            i++;
        }

      






















    }
}
