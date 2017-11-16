package december19;

public class StopThread {

    public static void main(String[] args) {

        Thread thread = new Thread();
        thread.stop();
        thread.suspend();
        thread.resume();
        thread.destroy();

        thread.interrupt();
    }

}
