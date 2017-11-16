package october19.initialize;

public class Chair extends Furniture {

    public static int d = getInt();

    public int e = getNonStaticIntChair();

    static {
        System.out.println("static block chair");
    }

    {
        System.out.println("block chair");
    }

    public Chair() {
        super();
        System.out.println("constructor chair");
    }

    private int getNonStaticIntChair() {
        System.out.println("non-static method chair");
        return 1;
    }

    private static int getInt() {
        System.out.println("static method chair");
        return 1;
    }

}
