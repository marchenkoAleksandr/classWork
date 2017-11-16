package december14.wait;

import java.util.Random;

public class Producer extends Thread {

    Random random = new Random();
    Buffer buffer;

    public Producer(Buffer buffer) {
        super();
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String order = String.valueOf(random.nextInt(100));

            try {
                Thread.sleep(3300);
                System.out.println("Producer: " + Thread.currentThread().getName() + ". Order: " + order);
                buffer.add(order);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
