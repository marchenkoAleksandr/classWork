package november14;

import september28.Array;

import java.util.ArrayList;

/**
 * Created by kovalchuk on 14.11.2016.
 */
public class Collect {

    public static void main(String[] args) {

        ArrayList integerList = new ArrayList();

        Integer a = 1;
        String b = "2";

        integerList.add(a);
        integerList.add(b);

        Object o1 = integerList.get(0);
        Object o2 = integerList.get(1);

        System.out.println((Integer) o1);
        System.out.println((String) o2);

        Typed<String> typed = new Typed<>("2");
        Typed<Integer> typed2 = new Typed<>(2);

        DoubleTyped<String, Boolean, Integer, Long, Double> shopopalo = new DoubleTyped<>();

        shopopalo.setName(300L);

        ArrayList<String> list = new ArrayList<>();

        list.contains(1);

    }
}
