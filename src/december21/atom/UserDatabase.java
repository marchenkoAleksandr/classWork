package december21.atom;

public class UserDatabase {

    int idCounter = 1;

    public int getNextId() {
        return idCounter++;
    }

    public int getIdCounter() {
        return idCounter;
    }
}
