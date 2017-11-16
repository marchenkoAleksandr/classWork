package december12;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Внутри потока." + Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignore) {/*NOP*/}

        System.out.println("В конце потока." + Thread.currentThread().getName());
    }

}
