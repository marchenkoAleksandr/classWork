package october31;

public class EventTest {

    public static void main(String[] args) {

        Event lightOn = Event.getLightOn();
        Event waterOn = Event.getWaterOn();

        Event[] events = {lightOn, waterOn};

        for (Event event: events) {
            event.action();
        }

    }

}
