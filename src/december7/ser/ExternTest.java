package december7.ser;

import java.io.*;

public class ExternTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        TaskExter task1 = new TaskExter(1);
//        task1.setN(1);

        System.out.println(task1.getN());

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteArrayOutputStream);
        out.writeObject(task1);
        out.flush();
        out.close();
        byte[] bytes = byteArrayOutputStream.toByteArray();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bytes));
        TaskExter taskExter2 = (TaskExter) in.readObject();

        System.out.println(taskExter2.getN());

    }

}
