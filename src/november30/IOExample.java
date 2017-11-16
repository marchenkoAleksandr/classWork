package november30;

import java.io.*;

public class IOExample {

    public static void main(String[] args) throws IOException {

        InputStream stream = new FileInputStream("D:/Hello.java");

        System.out.println(stream.available());

        byte[] fullBuffer = new byte[stream.available()];

        byte[] buffer = new byte[50];


        // читаем в буффер методом read, который возвращает кол-во считанных байт
        // в следующий раз при вызове, читаются следующие байты
        // если нет данных, то возращает -1.

        int byteCount;

        do {
            byteCount = stream.read(buffer);
            System.out.println(byteCount);
        } while (byteCount > 0);

        // будьте внимательны, метод не очищает буффер, а пишет поверх. Могут остаться старые данные


    }
}
