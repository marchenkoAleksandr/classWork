package october31.collection;

public class TestCollection {

    public static void main(String[] args) {
        IntegerCollection collection = new IntegerCollection(10);

        for (int i = 0; i < 14; i++) {
            collection.add(i);
        }

        System.out.println(collection);

        IntegerCollection.Iterator iterator = collection.getIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

}
