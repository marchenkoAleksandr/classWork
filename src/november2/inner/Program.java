package november2.inner;

public class Program {

    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Inner.Sub sub = inner.new Sub();

    }

}
