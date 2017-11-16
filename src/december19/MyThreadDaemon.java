package december19;

public class MyThreadDaemon extends Thread {

    private int counter = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println(counter++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new MyThreadDaemon();
        thread.setDaemon(true);
        thread.isDaemon();
        thread.start();
        Thread.sleep(4000);
        System.out.println("main finished");
    }
}
