package october28.pool;

public class Pooling {

    public static void main(String[] args) {

        // String pool

        String first = "Hello";
        String second = "Hello";

        System.out.println(first == second);

        String a = new String("Hello");
        String b = new String("Hello");

        System.out.println(a == b);

        String c = new String("Yo");
        String d = "Yo";

        System.out.println(c == d);

        String hi = new String("Hi").intern();
        String hi2 = "Hi";

        System.out.println(hi == hi2);

        // Integer pool


        Integer x = 10;
        Integer y = 10;

        System.out.println(x == y);

        Integer x1 = new Integer(10);
        Integer y1 = new Integer(10);

        System.out.println(x1 == y1);

        Integer x2 = 200;
        Integer y2 = 200;

        System.out.println(x2 == y2);


    }

}
