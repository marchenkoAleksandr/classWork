package december21;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Program {

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        List<Task> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            tasks.add(new Task(random, i));
        }
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<Future<Integer>> futures = new ArrayList<>();
        for(Task task : tasks) {
            futures.add(executorService.submit(task));
        }
        TimeUnit.SECONDS.sleep(1);
        executorService.shutdownNow();
        executorService.submit(new Task(random, 20));
        TimeUnit.SECONDS.sleep(3);

        for (Future<Integer> f: futures) {
            System.out.println(f.isDone() + " " + f.isCancelled());
        }


    }

}
