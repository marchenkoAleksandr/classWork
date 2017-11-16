package october17.robot;

public class Robocop extends Robot {

    String name;

    public Robocop(int weight, String model) {
        //super(); //Robot()
        super(weight, model); //Robot(weight, model)
    }

//    public void showWho() {
//        System.out.println("I AM A ROBOT");
//    }  //нельзя переопределять final методы
}
