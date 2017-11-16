package november16.collect;

import java.util.*;

/**
 * Created by kovalchuk on 16.11.2016.
 */
public class SetExample {

    public static void main(String[] args) {

        Set<Integer> integers = new LinkedHashSet<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(1);
        integers.add(2);

        System.out.println(integers);

        List<Integer> integerList = Arrays.asList(1, 5, 6, 6, 7, 3, 5, 4);

        System.out.println(integerList);
        integers.addAll(integerList);
        System.out.println(integers);

        Set<String> strings = new TreeSet<>();

        strings.add("BITCH");
        strings.add("YOU");
        strings.add("FUCK");
        strings.add("ROCK");
        strings.add("ASKOLD");

        System.out.println(strings);

    }

}
