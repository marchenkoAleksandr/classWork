package october19.interfaces.bigproject.repository;

import october19.interfaces.move.Auto;

public interface Repository {

    void add(Auto auto);

    Auto get(int id);

    void delete(int id);

    void deleteAll();

    Auto[] getAll();

}
