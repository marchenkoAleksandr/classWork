package december14.wait;

public class Buffer {

    String order;

    synchronized void add(String order) throws InterruptedException {
        while (this.order != null) {
            wait(); // ожидать (попасть в wait-set по этому монитору) объект класса Buffer
        }
        this.order = order;
        notify(); // разбудить один поток, который вызвал wait по этому монитору (находится в wait-set этого монитора)
    }

    synchronized String get() throws InterruptedException {
        while (order == null) {
            wait();
        }
        String temp = order;
        order = null;
        notify();
        return temp;

    }

}
