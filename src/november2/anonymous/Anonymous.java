package november2.anonymous;

public class Anonymous {

    public static void main(String[] args) {

        // anonymous class implemented interface

        String move = new Movable() {

            @Override
            public String move() {
                return "anonymous move";
            }
        }.move();

        System.out.println(move);

        // anonymous class implemented abstract class

        int x = 20;
//        x++;  // x must be final or effectively final

        AbstractClass abstractClass = new AbstractClass(5) {

            static final String ST = "o";

            int another;
            {
                another = 10;
            }

            @Override
            void method() {

//                System.out.println(x);
                System.out.println(field);
            }
        };

        abstractClass.method();

        String simpleName = abstractClass.getClass().getName();

        System.out.println(simpleName);
    }
}
