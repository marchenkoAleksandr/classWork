package november23.generic.iterable;

import java.util.*;

/**
 * Created by kovalchuk on 21.11.2016.
 */
public class IterProg {

    public static void main(String[] args) {

        /*int[] array = {1, 4, 6, 8};
        for(int i : array) {
            System.out.println(i);
        }

        Collection<Integer> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(6, 9, 13));

        for (Integer i : collection) {
            System.out.println(i);
        }

        MyIterable<String> strings = new MyIterable<>(new String[10]);

        for(String s : strings) {

        }*/

        MyArrayList<String> myList = new MyArrayList<>();
        myList.addAll(Arrays.asList("A", "B", "C", "D", "E"));

//        Iterator<String> stringIterator = myList.myIterable();

//        while (stringIterator.hasNext()) {
//            System.out.println(stringIterator.next());
//        }

        for (String s : myList.myIterable()) {
            System.out.println(s);
        }

    }
}
