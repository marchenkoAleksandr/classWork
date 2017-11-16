package december19;

public class MyThread extends Thread {

    private int counter = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println(counter++);
            try {
                Thread.sleep(1000);
                yield();
            } catch (InterruptedException e) {
                System.out.println("interrupted");
                break; // or return;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MyThread thread = new MyThread();
        thread.start();

        Thread.sleep(5500);
        thread.interrupt(); // посылает сигнал о прерывании потока
//        thread.destroy(); // не рекуомендуется использовать
//        thread.stop(); // помечены устаревшими, могут быть трудно уловимые ошибки.

    }


}
