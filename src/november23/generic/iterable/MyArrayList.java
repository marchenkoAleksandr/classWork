package november23.generic.iterable;


import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList<T> extends ArrayList<T> {

    public Iterable<T> myIterable() {

        return new Iterable<T>()  {

            @Override
            public Iterator<T> iterator() {

                return new Iterator<T>() {

                    int index = 0;

                    @Override
                    public boolean hasNext() {
                        return index < size();
                    }

                    @Override
                    public T next() {
                        T t = get(index);
                        index += 2;
                        return t;
                    }

                    @Override
                    public void remove() {

                    }

                };

            }

        };

    }

}
