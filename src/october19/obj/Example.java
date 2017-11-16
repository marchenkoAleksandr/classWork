package october19.obj;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
        Object o = new Object();
        String s = o.toString();
        System.out.println(s);

        Aeroplan aeroplan = new Aeroplan(1988, "Kukuruznik");
        System.out.println(aeroplan);

        System.out.println(aeroplan.getClass());

        // доступ к внутренностям класса. Reflection.

        Class<? extends Aeroplan> aClass = aeroplan.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

    }
}
