package november7;


import java.io.FileNotFoundException;
import java.util.Random;

public class Exc2 {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(2);

        if (x == 0) {
            ArithmeticException exception = new ArithmeticException();
//            FileNotFoundException exception = new FileNotFoundException();
//            Father father = new Father();
            throw  exception;
        }

        System.out.println("повезло");

    }

}
