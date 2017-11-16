package december7.ser;

import java.io.Serializable;

public class B extends A implements Serializable {

    int j;

    public B(int i, int j) {
        super(i);
        this.j = j;
    }


}
