package november30;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {

    public static void main(String[] args) throws IOException {

        File file1 = new File("D:/Hello.java");

        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());

        File file2 = new File("Hello2.java");
        System.out.println(file2.exists());
        System.out.println(file2.createNewFile()); // создаем файл, если его нет вернет true, если был - false
        System.out.println(file2.getName());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
//        System.out.println(file2.delete());
        System.out.println(file2.exists());
        System.out.println(file2.getParent());

        File directory = new File("D:/itstep");
        System.out.println(directory.mkdir());
        System.out.println(directory.isDirectory());

        File directory2 = new File("D:/");
        System.out.println(Arrays.toString(directory2.list()));



    }

}
