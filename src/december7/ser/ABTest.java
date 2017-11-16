package december7.ser;

import java.io.*;

public class ABTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        B b1 = new B(1, 2);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteArrayOutputStream);
        out.writeObject(b1);
        out.flush();
        out.close();
        byte[] bytes = byteArrayOutputStream.toByteArray();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bytes));
        B b2 = (B) in.readObject();

    }

}
