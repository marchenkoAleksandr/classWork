package november21;

import java.util.ArrayList;
import java.util.LinkedList;

public class MemoryFail {

    public static int counter = 1;

    public static void main(String[] args) {

//        stackTest();
        heapTest();

    }

    public static void stackTest() {

        System.out.println(counter++);

        String s = new String("Test");

        stackTest();

    }

    public static void heapTest() {

        LinkedList<ArrayList> list = new LinkedList<>();
        while (true) {
            System.out.println(counter++);
//            list.add();
        }

    }

}
