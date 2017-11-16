package october19.obj;

public class Aeroplan {

    int year;

    String model;

    public Aeroplan(int year, String model) {
        this.year = year;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Aeroplan{" +
                "year=" + year +
                ", model='" + model + '\'' +
                '}';
    }
}
