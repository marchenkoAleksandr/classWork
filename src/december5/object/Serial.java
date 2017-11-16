package december5.object;

import java.io.*;

public class Serial {

    public static void main(String[] args) {

        Order order = new Order(3, 5800);

        try {
            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("D:/object.out"));
            stream.writeObject(order);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Order serialized = null;

        try {
            ObjectInputStream iStream = new ObjectInputStream(new FileInputStream("D:/object.out"));
            serialized = (Order) iStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(serialized);

    }

}
