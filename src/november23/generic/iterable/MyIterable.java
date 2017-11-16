package november23.generic.iterable;

import java.util.Iterator;

public class MyIterable<T> implements Iterable<T> {

    T[] array;

    public MyIterable(T[] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
