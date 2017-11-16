package october19.initialize;

public class Furniture {

    public static int i = getInt();

    public int a = getNonStaticInt();

    static {
        System.out.println("static block furniture");
    }

    {
        System.out.println("block furniture");
    }

    public Furniture() {
        super();
        System.out.println("constructor furniture");
    }

    private int getNonStaticInt() {
        System.out.println("non-static method furniture");
        return 1;
    }

    private static int getInt() {
        System.out.println("static method furniture");
        return 1;
    }


}
