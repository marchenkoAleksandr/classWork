package november14;

/**
 * Created by kovalchuk on 14.11.2016.
 */
public class DoubleTyped<K, V, A, F, J> {

    K key;
    V value;

    F name;
    J age;
    A nick;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public F getName() {
        return name;
    }

    public void setName(F name) {
        this.name = name;
    }

    public J getAge() {
        return age;
    }

    public void setAge(J age) {
        this.age = age;
    }

    public A getNick() {
        return nick;
    }

    public void setNick(A nick) {
        this.nick = nick;
    }
}
