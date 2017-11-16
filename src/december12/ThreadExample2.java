package december12;

public class ThreadExample2 {

    public static void main(String[] args) {

        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread();
        }

        for (Thread thread : threads) {
            thread.start();
        }

    }

}
