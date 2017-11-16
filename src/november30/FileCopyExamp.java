package november30;

import java.io.*;

public class FileCopyExamp {

    public static void main(String[] args) throws IOException {

        // создаем объект для работы с файлом
        File in = new File("D:/Hello.java");
        if (!in.canRead()) {
            System.out.println("sorry");
            System.exit(0);
        }
        FileInputStream inputStream = new FileInputStream(in);

        File out = new File("D:/itstep/Hello.java");
        if (!out.createNewFile()) {
            System.out.println("sorry 2");
            System.exit(4);
        }

        FileOutputStream outputStream = new FileOutputStream(out);

        // создаем буффер для чтения файла, рамзем в 3 раза меньше чем размер файла
        byte[] buffer = new byte[inputStream.available() / 3];

        int byteCount = 0;

        while ((byteCount = inputStream.read(buffer)) > -1) {
            outputStream.write(buffer, 0, byteCount);
        }

        outputStream.flush();
        outputStream.close();
        inputStream.close();

        System.out.println("success");

    }

}
