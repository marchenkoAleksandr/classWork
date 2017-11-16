package november30;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandAccess {

    public static void main(String[] args) {

        try(RandomAccessFile in = new RandomAccessFile("D:/Hello.java", "r"); // если чтение, то r
            RandomAccessFile out = new RandomAccessFile("D:/itstep/Hello.java", "w")) { // если запись, то rw

            in.seek(30);
            out.seek(96);

            System.out.println(in.getFilePointer()); // выводит текущее положение указателя в файле

            byte[] buffer = new byte[20];
            in.read(buffer);
            out.write(buffer);
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
