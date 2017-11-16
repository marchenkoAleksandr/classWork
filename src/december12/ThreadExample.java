package december12;

public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        System.out.println("Внутри мейна.");
        Thread myThread = new MyThread();
        myThread.start();

        new MyThread().start();

        new Thread() {

            @Override
            public void run() {
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Anonymous");
            }

        }.start();

        System.out.println("до джойна");
        myThread.join();
        System.out.println("после джойна");

        Thread.sleep(100);
        System.out.println("Конец мейна.");
    }

}
