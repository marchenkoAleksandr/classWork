package october31.collection;

import java.util.Arrays;

public class IntegerCollection {

    private static int defaultCapacity = 15;

    private int size = 0;

    private Integer[] array;

    public IntegerCollection() {
        array = new Integer[defaultCapacity];
    }

    public IntegerCollection(int capacity) {
        array = new Integer[capacity];
    }

    public void add(Integer value) {
        array[size++] = value;
        if (size == array.length) {
            increaseCapacity();
        }
    }

    private void increaseCapacity() {
        Integer[] temp = array;
        array = new Integer[temp.length * 3 / 2];
        System.arraycopy(temp, 0, array, 0, temp.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }



    class Iterator {

        private int index = 0;

        public boolean hasNext() {

            return index < array.length;
        }

        public Integer next() {
            return array[index++];
        }
    }

    public Iterator getIterator() {
        return new Iterator();
    }
}
