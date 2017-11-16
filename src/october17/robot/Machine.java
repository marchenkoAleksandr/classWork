package october17.robot;

public abstract class Machine {

    int year;

    public Machine() {
    }

    public Machine(int year) {
        this.year = year;
    }

    abstract public void start();

    public void showYear() {
        System.out.println(year);
    }
}
