package december7.ser;

import java.io.*;

public class SerialTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        TaskSerial task1 = new TaskSerial(1);
        System.out.print(task1.s + " ");
        System.out.println(task1.getN());

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/task.out"));
        out.writeObject(task1);
        out.close();

        TaskSerial task2 = new TaskSerial(2);
        System.out.print(task2.s + " ");
        System.out.println(task2.getN());

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/task.out"));
        TaskSerial task3 = (TaskSerial) in.readObject();
        System.out.print(task3.s + " ");
        System.out.println(task3.getN());

    }

}
