package december21;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Task implements Callable<Integer>{

    private Random random;
    private int id;

    public Task(Random random, int id) {
        this.random = random;
        this.id = id;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("task id: " + id + ". executor: " + Thread.currentThread().getName());
        int seconds = random.nextInt(5);
        TimeUnit.SECONDS.sleep(seconds);
        return seconds;
    }

}
