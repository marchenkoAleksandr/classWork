package december7.ser;

import java.io.Serializable;

public class TaskSerial implements Serializable {

    public static int s = 0;
    public final int n;

    public TaskSerial(int n) {
        s = n;
        this.n = n;
    }

    public int getN() {
        return n;
    }

}
