package october26.eqHash;

public class EqualHash {

    public static void main(String[] args) {

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o2;

        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode() == o2.hashCode());

        System.out.println(o2.equals(o3));
        System.out.println(o2.hashCode() == o3.hashCode());

        Entity e1 = new Entity(1);
        Entity e2 = new Entity(2);
        Entity e3 = new Entity(1);

        System.out.println(e1.equals(e3));
        System.out.println(e1.hashCode() == e3.hashCode());
    }
}
