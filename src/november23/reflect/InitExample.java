package november23.reflect;

public class InitExample {

    public static final int X = 10;

    public static int y;

    public String field;

    public int z;

    static {
        y = 5;
        System.out.println("static block");
    }

    {
        field = "Field";
        System.out.println("non static block");
    }

    public InitExample(int z) {
        System.out.println("constructor");
        this.z = z;
    }
}
