package november21.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCard {

    public static double sum = 0;

    public static void main(String[] args) {

        List<? extends Number> numbers = new ArrayList<Integer>();
        numbers = new ArrayList<>();



        add(new ArrayList<Integer>(Arrays.asList(1, 5, 67)));
        add(new ArrayList<Double>(Arrays.asList(2.6, 3.0, 4.4)));

        System.out.println(sum);
    }

    public static Number getNumber() {
        return new Integer(4);
    }

    public static void add(List<? extends Number> list) {

        for(Number number : list) {
            sum += number.doubleValue();
        }

    }

    public static void addSuper(List<? super Number> list) {

        Object object = list.get(0);

    }

}
