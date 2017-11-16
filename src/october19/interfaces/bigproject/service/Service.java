package october19.interfaces.bigproject.service;

import october19.interfaces.move.Auto;
import october19.interfaces.move.BMW;
import october19.interfaces.bigproject.repository.Repository;

public class Service {

    Repository repository = null;

    public void service() {
        Auto auto = new BMW();

        repository.add(auto);

        System.out.println("Added");

        repository.delete(auto.getId());
    }

}
