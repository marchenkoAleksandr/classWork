package december19.philosophy;

public class Phylosoph extends Thread {

    private Fork left;
    private Fork right;

    public Phylosoph(Fork left, Fork right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        while(true) {
            try {
                left.take();
                System.out.println(Thread.currentThread().getId() + " took fork " + left.getId());
                right.take();
                System.out.println(Thread.currentThread().getId() + " took fork" + right.getId());
                System.out.println(Thread.currentThread().getId() + " eating...");
                left.drop();
                System.out.println(Thread.currentThread().getId() + " dropped fork" + left.getId());
                right.drop();
                System.out.println(Thread.currentThread().getId() + " dropped fork" + right.getId());
                Thread.sleep(1000);
            } catch (InterruptedException e) {/*NOP*/}
        }
    }

}
