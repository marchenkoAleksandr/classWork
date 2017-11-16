package november16.collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> strings = new LinkedList<>();
//        Queue<String> queue = (Queue<String>) strings; // hint

        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");

        System.out.println("first list");
        System.out.println(strings);

        /*SUBLIST*/
//        System.out.println("sublist");
//        List<String> subList = strings.subList(0, 2);
//        System.out.println(subList);

        System.out.println("second list");;
        List<String> otherList = new ArrayList<>();
        otherList.add("C");
        otherList.add("D");
        otherList.add("E");
        otherList.add("F");
        System.out.println(otherList);

        System.out.println("try to retain");
        boolean result = strings.retainAll(otherList);
        System.out.println(result);

        System.out.println("first list after retain");
        System.out.println(strings);

    }

}
