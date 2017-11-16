package october10;

/**
 * Created by kovalchuk on 10.10.2016.
 */
public class Cat extends Pet{

    int healthCount;

    public Cat(int healthCount) {
        this.healthCount = healthCount;
    }

    public void info() {
        System.out.printf("Name: %s, age: %s, color: %s, Health count: %s%n", getName(), getAge(), getColor(), healthCount);
    }

    @Override
    public void makeSomeNoize() {
        System.out.println("MEOW");;
    }
}
