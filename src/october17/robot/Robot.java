package october17.robot;

public class Robot extends Machine {

    int weight;
    String model;

    private Robot() {

    }

    @Override
    public void start() {
        System.out.println("I AM A ROBOT, I STARTED");
    }

    public Robot(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public final void showWho() {
        System.out.println("I AM A ROBOT");
    }
}
