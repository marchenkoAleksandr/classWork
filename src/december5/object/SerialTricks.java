package december5.object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialTricks {

    public static void main(String[] args) {

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
