package october28.inherit;

public class A {

    public void print() {
        System.out.println("print a");
    }

    protected void show() {
        System.out.println("show a");
    }

    public A getMyself() {
        return new A();
    }

    public void print(String s) {
        System.out.println(s);
    }
}
