package december5.primitive;

import java.io.*;

public class StringIO {

    public static void main(String[] args) throws IOException {

        String str = "Vasya";
        long lng = Long.MAX_VALUE;

        String strLng = String.valueOf(lng);

        byte[] strBytes = str.getBytes();
        char[] strChars = str.toCharArray();

        OutputStream outStream = new FileOutputStream("D:/bytes.txt");
        Writer outWriter = new FileWriter("D:/chars.txt");

        outStream.write(strBytes);
        outStream.flush();
        outStream.close();

        outWriter.write(strChars);
        outWriter.flush();
        outWriter.close();



    }

}
