package october26.eqHash;

public class Entity {

    public static final int NUMBER = 5;
    public static final int NUMBER2 = 6;


    int id;
    int age;
    int year;

    public Entity(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                '}';
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + age;
        result = 31 * result + year;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity entity = (Entity) o;

        if (id != entity.id) return false;
        if (age != entity.age) return false;
        return year == entity.year;

    }
}
