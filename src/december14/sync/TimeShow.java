package december14.sync;

import java.util.Date;
import java.util.Random;

public class TimeShow {

    Random random = new Random();

    public synchronized void showTime() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println(new Date());

    }

}
