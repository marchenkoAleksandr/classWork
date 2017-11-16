package december5.primitive;

import java.io.*;
import java.util.Arrays;

public class DataIO {

    public static void main(String[] args) throws IOException {

        long lng = Long.MAX_VALUE;
        System.out.println(lng);
//        String str = "Vasya";

        DataOutputStream outData = new DataOutputStream(new FileOutputStream("D:/lng.txt"));
        outData.writeLong(lng);
//        outData.writeUTF(str);

        InputStream stream = new FileInputStream("D:/lng.txt");
        byte[] buffer = new byte[stream.available()];
        stream.read(buffer);
        System.out.println(Arrays.toString(buffer));
        stream.close();

        DataInputStream inData = new DataInputStream(new FileInputStream("D:/lng.txt"));
        long result = inData.readLong();
        System.out.println(result);
//        String resultStr = inData.readUTF();
//        System.out.println(resultStr);

    }

}
