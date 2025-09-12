package practice_10.homework.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTask {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Future<String>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            final int taskId = i;

            Future<String> future = executor.submit(() -> {
                Thread.sleep(2000);
                return "Задача " + taskId + " выполнена потоком " + Thread.currentThread().getName();
            });

            futures.add(future);
        }

        for (Future<String> future : futures) {
            try {
                String result = future.get();
                System.out.println(result);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        executor.shutdown();

    }
}
