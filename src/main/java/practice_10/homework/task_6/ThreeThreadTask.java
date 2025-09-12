package practice_10.homework.task_6;

import java.util.ArrayList;
import java.util.List;

public class ThreeThreadTask {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            numbers.add(i);
        }

        Result result = new Result();

        Thread t1 = new Thread(new Worker(numbers, 0, 3, result));
        Thread t2 = new Thread(new Worker(numbers, 3, 6, result));
        Thread t3 = new Thread(new Worker(numbers, 6, 9, result));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Элементов обработано: " + result.getCount());
        System.out.println("Сумма: " + result.getSum());

    }


}
