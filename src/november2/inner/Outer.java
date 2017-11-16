package november2.inner;

public class Outer {
    int x = 1;
    {
        System.out.println(x);
    }

    class Inner {
        int x = 2;
        {
            System.out.println(x);
        }

        class Sub {
            int x = 3;
            {
                System.out.println(x);
            }

        }

    }

}
