package october19.interfaces.methods;

import java.util.Random;

public class GenerateMessage implements Messagable{

    @Override
    public String message() {
        return String.valueOf(new Random().nextInt());
    }
}
