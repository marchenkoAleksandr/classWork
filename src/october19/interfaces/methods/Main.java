package october19.interfaces.methods;

public class Main {

    public static void showMessage(Messagable messagable) {
        System.out.println("logic ....");

        String message = messagable.message();

        System.out.println(messagable.message());
    }
}
