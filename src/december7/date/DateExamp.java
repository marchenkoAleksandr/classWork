package december7.date;

import java.util.Date;
import java.util.Random;

public class DateExamp {

    public static void main(String[] args) throws InterruptedException {

        Date now = new Date();
        System.out.println(now);

//        System.out.println(now.getYear());
//        System.out.println(now.getMonth());
        System.out.println(now.getTime()); // 1 january 1970
        System.out.println(Long.MAX_VALUE);

        System.out.println(9223370000000000000L / 1000 / 60 / 60 / 24);

        Date example = new Date();
        example.setTime(1);
        System.out.println(example);

//        pause();

        Date after = new Date();

        System.out.println(after.getTime() - now.getTime());

    }

    public static void pause() throws InterruptedException {

        Random random = new Random();

        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            int j = random.nextInt();
            Math.sqrt(j);
        }

    }

}
