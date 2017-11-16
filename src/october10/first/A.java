package october10.first;

public class A {

    private static int priv = 1;
    static int pack = 2;
    protected static int protec = 3;
    public static int publ = 4;

    public int getPriv() {
        return priv;
    }

    private int getPack() {
        return pack;
    }

    int getProtec() {
        return protec;
    }

    protected int getPubl() {
        return publ;
    }
}
