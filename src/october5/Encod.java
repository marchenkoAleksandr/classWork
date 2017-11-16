package october5;

import september28.Array;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedMap;

public class Encod {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "String Привет";
        byte[] utfBytes = str.getBytes("UTF-8");
        System.out.println(Arrays.toString(utfBytes));
        byte[] win1251Bytes = str.getBytes("windows-1251");
        System.out.println(Arrays.toString(win1251Bytes));

        String first = new String(utfBytes);
        String second = new String(win1251Bytes);

        System.out.println(first);
        System.out.println(second);
    }

    static void showEncodings() {
        SortedMap<String, Charset> charsetsMap = Charset.availableCharsets();
        System.out.println("Charsets available: "+charsetsMap.size());
        for(String name : charsetsMap.keySet()){
            System.out.println(name);
        }
    }
}
