package october28.inherit;

public class B extends A {

    @Override
    /*protected*/ public void print() { // сужать запрещено
        System.out.println("print b");
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public B getMyself() {
        return new B();
    }

    public void newMethod() {

    }

    public void print(Object o) {
        System.out.println(o);
    }
}
