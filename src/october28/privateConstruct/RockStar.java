package october28.privateConstruct;

public class RockStar {

    private static int counter = 0;

    public static RockStar getInstance() {
        if (counter < 100) {
            return new RockStar();
        } else {
            return null;
        }

    }

    private RockStar() {

    }


}
