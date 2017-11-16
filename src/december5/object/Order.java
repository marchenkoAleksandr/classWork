package december5.object;

import java.io.Serializable;

public class Order implements Serializable {

//    private static int idCounter = 10;

    private final int id;
    private transient long amount;

    public Order(int id, long amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public long getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
