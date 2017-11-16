package december14.wait;


public class Program {

    public static void main(String[] args) {

        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread prod = producer; // не обязательно, можно просто producer.start()
        Thread cons = new Thread(consumer);

        prod.start();
        cons.start();

    }

}
