package november16.map;

import java.util.*;

/**
 * Created by kovalchuk on 16.11.2016.
 */
public class MapExample {

    public static void main(String[] args) {

//        Map<Integer, String> map = new HashMap<>();
//
//        map.put(1, "Vasya");
//        map.put(2, "Anya");
//        map.put(5, "Diego");
//
//        System.out.println(map);
//
//        String hz = map.put(2, "Yegor");
//        System.out.println(hz);
//
//        String hz2 = map.put(7, "Rebeca");
//        System.out.println(hz2);
//
//        Set<Integer> keys = map.keySet();
//        System.out.println(keys);
//
//        for (Integer key : keys) {
//            System.out.println(map.get(key));
//        }
//
//        for(Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

        Map<Integer, Integer> integerMap = new HashMap<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randomInt = random.nextInt(30);
            Integer value = integerMap.get(randomInt);
            if(value == null) {
                value = 1;
            } else {
                value++;
            }

            integerMap.put(randomInt, value);
        }

        System.out.println(integerMap);


        Map<Integer, List<Order>> ordersByUser = new HashMap<>();
        /* взять заказы только определенного юзера */
        List<Order> orders = ordersByUser.get(1);


    }







}
