package october31;

public abstract class Event {

    abstract void action();

    static private class WaterOn extends Event {

        @Override
        void action() {
            System.out.println("Water on");
        }
    }

    public static WaterOn getWaterOn() {
        return new WaterOn();
    }

    static private class LightOn extends Event {

        @Override
        void action() {
            System.out.println("Light on");
        }
    }

    public static LightOn getLightOn() {
        return new LightOn();
    }

}
