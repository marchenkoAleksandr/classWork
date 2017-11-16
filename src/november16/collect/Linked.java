package november16.collect;

import java.util.LinkedList;

/**
 * Created by kovalchuk on 16.11.2016.
 */
public class Linked {

    public static void main(String[] args) {

        LinkedList listQueue = new LinkedList();

        Object o = new Object();

        System.out.println(o.hashCode());

        listQueue.addLast(o);
        Object first = listQueue.getFirst();

        System.out.println(first.hashCode());

        System.out.println(listQueue.size());


    }

}
