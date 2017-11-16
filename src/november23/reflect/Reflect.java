package november23.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflect {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException, InstantiationException {

        User user = new User(1, "Nikolas");

        // var args
//        user.printInts(new String[122]);

        Class<? extends User> aClass = user.getClass();
        Class userClass = User.class;
        Class user1 = Class.forName("november23.reflect.User");

        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());

        System.out.println(userClass.getName());
        System.out.println(user1.getName());

        System.out.println(aClass.equals(user1));
        System.out.println(aClass == user1);

        for (Method method : aClass.getMethods()) {
            System.out.println(method.getName());
        }

//        for (Method method : aClass.getDeclaredMethods()) {
//            System.out.println(method.getName());
//        }

        Method show = aClass.getDeclaredMethod("show", int.class);
        System.out.println(show.getName());

//        чтобы вызвать приватный метод, нужно включить доступ (передать true в метод setAccessible
        show.setAccessible(true);
        show.invoke(user, 1);

        Class superclass = aClass.getSuperclass();
        System.out.println(superclass.getName());

        Class[] interfaces = aClass.getInterfaces();
        System.out.println(Arrays.toString(interfaces));

        Field name = aClass.getField("name");
        String value = (String)name.get(user);
        System.out.println(value);

        Method staticShow = aClass.getDeclaredMethod("staticShow", int.class);
        staticShow.setAccessible(true);
        staticShow.invoke(null, 1); // чтобы вызвать статический метод, передайте Null

        User user2 = aClass.newInstance();

        System.out.println(InitExample.X);
        System.out.println(InitExample.y);
        InitExample initExample = new InitExample(1);

    }

}
