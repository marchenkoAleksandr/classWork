package december7.ser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class TaskExter implements Externalizable {

    private /*final*/ int n; // final поля нельзя сериализовать через External

    public TaskExter() {
    }

    public TaskExter(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(n);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        n = in.readInt();
    }

}
