package october19.interfaces.move;

public class Marshrutka extends Auto implements Movable, Destroyable {

    @Override
    public void move() {
        System.out.println("I AM MARSHRUTKA, I AM MOVING");
    }

}
