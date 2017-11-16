package october17.robot;

public class RoboOOP {

    public static void main(String[] args) {
        Robot robot = new Robot(5000, "T1000");
        Robocop robocop = new Robocop(11, "T900");

        System.out.println(robot.model);
        System.out.println(robot.weight);

        robot.showWho();

        Machine machine = new Robot(1000, "TT");
//        Machine machine1 = new Machine(100); //экземпляры абстрактного класса нельзя создавать


    }
}
