package november9;

import java.util.Arrays;

/**
 * Created by kovalchuk on 09.11.2016.
 */
public class Cause {

    public static void main(String[] args) {

        try {
            logic();
        } catch (Exception e) {
//            e.printStackTrace(); //распечатка методов через которые летело исключение
            System.out.println(e.getCause().getMessage());
            System.out.println(Arrays.toString(e.getSuppressed()));
        }

        System.out.println("EVERYTHING IS OK");

    }

    public static void logic() throws Exception {
        try {
            throwable();
        } catch (ArithmeticException e) {
//            Exception ex = new Exception(e); // add cause in constructor
            ArithmeticException exception = new ArithmeticException();
            exception.initCause(e); // init cause by method
            throw exception;
//            throw new Exception(e);
        }
    }


    public static void throwable() {
        throw new ArithmeticException("/ by zero");
    }

}
