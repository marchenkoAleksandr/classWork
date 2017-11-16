package october3;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String s = "  Hello World! ";
        String s2 = "Matherfucka";
        String s3 = "a b";

        System.out.println(s.trim()); //trim
        System.out.println(s.charAt(5)); //char at current index
        System.out.println(s.indexOf('o')); // first index of current char
        System.out.println(s.indexOf('o', 5)); //first index of current char from index
        System.out.println(s.indexOf('w')); //example in not contains
        System.out.println(s.contains("He")); //contains true
        System.out.println(s.contains("ABC")); //contains false?
        System.out.println(s.substring(5)); //sub string from first index
        System.out.println(s.substring(6, 9)); //sub string from index to index
        System.out.println(s.replace('e', 'u')); //replace from one char to another
        System.out.println(s.replace("Hello", "Bye")); //replace from one string to another
        System.out.println(s.concat(s2)); //Concatenation of strings
        System.out.println(s + s2);
        System.out.println(s.replace(" ", "_"));
//        System.out.println(String.join(" + ", "a", "b", "c"));
        System.out.println(s2.toUpperCase()); //to upper case
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(Arrays.toString(s3.split(" ")));
        System.out.println(String.valueOf(5));
        System.out.println(5 + "");
        System.out.println("asdas".intern());


        String a = null;
        String b = "name";

        System.out.println(a + b);
//        System.out.println(a.concat(b)); //nullpointer

        String first = "abcde";
        String second = "HELL";
        String third = "HELL";
        System.out.println(second.compareTo(first));
        System.out.println(second.compareTo(third));


    }

}
