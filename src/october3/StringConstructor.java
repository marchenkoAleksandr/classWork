package october3;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class StringConstructor {

    public static void main(String[] args) throws UnsupportedEncodingException {

        char[] charArray = {'h', 'e', 'l', 'l', 'o'};

        String s = new String(charArray);

        System.out.println(s);

        byte[] bytes = s.getBytes();

        byte[] bytes2 = {3, 16, 90, 106, 55};

        String s2 = new String(bytes2);

        System.out.println(s2);

    }
}
