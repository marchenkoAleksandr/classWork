package october5;

import java.util.Locale;

/**
 * Created by kovalchuk on 05.10.2016.
 */
public class StrFormat {

    public static void main(String[] args) {
//        int a = 10;
//        double b = 2.8d;
//        String c = "Java";
//
//        System.out.println("Count = " + a + ", percent = " + b + ", Language is " + c);
//        System.out.printf("Count = %2$d, percent = %3$f, Language is %1$s", c, a, b);

//        for (int i = 1; i < 10; i ++) {
//            for(int j = 1; j < 10; j++) {
//                System.out.printf("%,15d", i * j * 1000000);
//            }
//            System.out.println();
//        }

//        System.out.println(Math.PI);
//        System.out.printf("%-.3f", Math.PI);

//        System.out.printf(Locale.ENGLISH, "%.2f%n", Math.PI);
//        System.out.printf(Locale.FRANCE, "%.2f", Math.PI);

//        for (int i = 1; i < 10; i ++) {
//            for(int j = 1; j < 10; j++) {
//                System.out.printf("%+010.5f", Math.random());
//            }
//            System.out.println();
//        }

        System.out.printf("%015.7f", 4.9);
    }
}
