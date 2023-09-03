package Class5;

import java.util.Scanner;

public class HwGradeSwitch {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your grade");
        String grade=scan.next();
        switch (grade){
        case "A":{System.out.println("Excellent");}
        break;
            case "B":{System.out.println("Good");}
            break;
            case "C":{System.out.println("Average");}
            break;
            case "D":{System.out.println("Bad");}
            break;
        default:{System.out.println("Not Acceptable");}
}




    }
}
