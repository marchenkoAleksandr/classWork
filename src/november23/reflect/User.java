package november23.reflect;


import java.util.Arrays;

public class User implements MyInterface{

    private int id;

    public String name;

    public static void staticShow(int i) {
        System.out.println(i);
    }

    private User(int id) {
        this.id = id;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
        System.out.println("const");
    }

    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void show(int i) {
        System.out.println(i);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    protected int getId() {
        return id;
    }

    // var args
    public void printInts(String... strings) {
        System.out.println(Arrays.toString(strings));
    }

}
