package november7;

import javax.sound.sampled.AudioInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exc {

    public static void main(String[] args) {

//        int x = 0;
//
//        try {
//            System.out.println(5 / x);
//            System.out.println("OK!");
//        } catch (RuntimeException | StackOverflowError e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("go on");

//        --------------

       /* Scanner scanner = new Scanner(System.in);
        Integer number = null;
        do {
            System.out.println("Enter number please");
            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Wrong number format");
            }
        } while (number == null);

        System.out.println(number);*/

//        -----------------------

        /*try {
            throwable();
        } catch (Throwable e) {
            System.out.println("");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
            */



    }

    public static void throwable() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("asdasd");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileInputStream inputStream = new FileInputStream("ahah");
//             Son son = new Son();
             Father father = new Father();
            BufferedInputStream bi = new BufferedInputStream(new AudioInputStream(null))) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
