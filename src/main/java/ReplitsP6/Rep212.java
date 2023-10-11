package ReplitsP6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Rep212 {
     static void printException () throws FileNotFoundException {
         String path="";
         FileInputStream file=new FileInputStream(path);
     }
    public static void main(String[] args) {

        try {
            printException();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    }
