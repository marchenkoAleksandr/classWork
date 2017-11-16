package december5.primitive;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ByteArray {

    public static void main(String[] args) throws IOException {

//        byte[] buffer = new byte[1000];
//        for(int i = 0; i < buffer.length; i++) {
//            buffer[i] = (byte) i;
//        }
//
//        InputStream stream = new ByteArrayInputStream(buffer);
//
//        System.out.println(stream.read());
//        System.out.println(stream.read());
//        System.out.println(stream.read());
//
//        stream.close();
        Scanner scanner = new Scanner(System.in) ;

        String[] strings = new String[5];
        for(int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for(int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }

}
