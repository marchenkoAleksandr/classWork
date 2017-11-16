package october19.interfaces.bigproject.repository;

import october19.interfaces.move.Auto;

public class RepositoryImpl implements Repository {

    private Auto[] repository = new Auto[100];
    private int index = 0;

    @Override
    public void add(Auto auto) {
        repository[index] = auto;
        index++;
    }

    @Override
    public Auto get(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Auto[] getAll() {
        return new Auto[0];
    }
}
