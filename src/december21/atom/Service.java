package december21.atom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Service {

    public static void main(String[] args) throws InterruptedException {

        UserDatabase database = new UserDatabase();
        List<User> users = new ArrayList<>();
        List<Registrator> registrators = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            User user = new User();
            users.add(user);
            registrators.add(new Registrator(user, database));
        }

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (Registrator r: registrators) {
            executorService.submit(r);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println(database.getIdCounter());

    }

}
