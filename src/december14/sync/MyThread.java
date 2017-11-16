package december14.sync;

import java.util.Random;

public class MyThread implements Runnable {

    TimeShow timeShow;
    Random random = new Random();

    public MyThread(TimeShow timeShow) {
        this.timeShow = timeShow;
    }

    @Override
    public void run() {
        while (true) {

            try {
                timeShow.showTime();
                Thread.sleep(random.nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
