package december21.atom;

public class Registrator implements Runnable {

    private User user;
    private UserDatabase database;

    public Registrator(User user, UserDatabase database) {
        this.user = user;
        this.database = database;
    }

    @Override
    public void run() {
        user.setId(database.getNextId());
    }

}
