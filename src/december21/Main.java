package december21;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Random random = new Random();
        List<Task> tasks = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            tasks.add(new Task(random, i));
        }

        ExecutorService executorService = Executors.newCachedThreadPool();

        // передали одну задачу на исполнение
        /*Future<Integer> submittedTask = executorService.submit(tasks.get(0));
        System.out.println("before get");
        Integer result = submittedTask.get(); // взять результат выполения задачи, блокируется
        System.out.println(result);*/

        List<Future<Integer>> futures = new ArrayList<>();
        // сабмитил в цикле
        /*for (Task task : tasks) {
            futures.add(executorService.submit(task)); // передаем на выполение по одной задаче
        }*/

        futures = executorService.invokeAll(tasks); // выполнить все задачи, не блокирует, сразу возвращает лист фьючеров
//        Integer res = executorService.invokeAny(tasks); // выполнить любую задачу, блокируется пока не выполнится хотя бы одна
//        System.out.println(res);

        executorService.shutdown();

    }


}
