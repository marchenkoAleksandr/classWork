package december12;

public class NotAtomicExample {

    private static /*volatile*/ int counter = 0; // volatile - не кешируется

    private static void increment() {

        synchronized (NotAtomicExample.class) {
            counter++;
        }


    }

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 1_000_000; i++) {
            increment();
        }

        myThread.join();

        System.out.println(counter);

    }

    private static class MyThread extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 1_000_000; i++) {
                increment();
            }
        }
    }

}
