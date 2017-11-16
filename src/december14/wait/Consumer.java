package december14.wait;

public class Consumer implements Runnable {

    Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String order = null;
            try {
                Thread.sleep(3400);
                order = buffer.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Consumer: " + Thread.currentThread().getName() + ". Order: " + order);
        }
    }
}
