package december14.sync;

public class Program {

    public static void main(String[] args) {

        TimeShow timeShow = new TimeShow();

        MyThread myThread1 = new MyThread(timeShow);
        MyThread myThread2 = new MyThread(timeShow);
        MyThread myThread3 = new MyThread(timeShow);

        Thread myThreadFirst = new Thread(myThread1);
        Thread myThreadSecond = new Thread(myThread2);
        Thread myThreadThird = new Thread(myThread3);

        myThreadFirst.start();
        myThreadSecond.start();
        myThreadThird.start();

    }

}
