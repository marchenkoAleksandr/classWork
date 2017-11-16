package october28.agregation;

public class Shuttle {

    private HandleModule module;

    public void go() {
        module.go();
    }

    public void stop() {
        module.stop();
    }

}
