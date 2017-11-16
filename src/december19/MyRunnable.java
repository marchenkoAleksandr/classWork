package december19;

public class MyRunnable implements Runnable {
    Thread thread;

    public MyRunnable() {
        thread = new Thread(this/*, "my_thread"*/);
        thread.setName("my_thread"); // можно задавать имя потока, сеттер или в конструкторе.
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("working...");
    }

    public static void main(String[] args) {
        System.out.println(new MyRunnable().thread.getName());
    }

}
