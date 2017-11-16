package december19.philosophy;

public class Fork {

    private int id;
    private boolean isTaken;

    public Fork(int id) {
        this.id = id;
    }

    public void take() throws InterruptedException {
        synchronized (this) {
            while (isTaken) {
                wait();
            }
            isTaken = true;
        }
    }

    public void drop() {
        synchronized (this) {
            isTaken = false;
            notify();
        }
    }


    public int getId() {
        return id;
    }
}
