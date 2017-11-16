package december19.Call;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Program {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Executors.newFixedThreadPool(4);
        Future<Integer> result = executorService.submit(new MyCallable());
        System.out.println("before get");
        System.out.println(result.isDone());
        Integer resultInt = result.get();
        System.out.println(result.isDone());
        System.out.println(resultInt);

    }


}
