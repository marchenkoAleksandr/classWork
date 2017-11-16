package november30;

import java.io.*;
import java.util.Scanner;

public class PatternExamp {

    public static void main(String[] args) throws IOException {

//        Scanner scanner = new Scanner(System.in);

//        Reader reader = new InputStreamReader(System.in);
//        int ch = reader.read();
//
//        System.out.println((char) ch);
//        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/Hello.java"));
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
        bufferedReader.close();
    }

}
