package practice_10.homework.task_6;

import java.util.List;

public class Worker implements Runnable {
    private final List<Integer> list;
    private final int start;
    private final int end;
    private final Result result;

    public Worker(List<Integer> list, int start, int end, Result result) {
        this.list = list;
        this.start = start;
        this.end = end;
        this.result = result;
    }


    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            int value = list.get(i);
            System.out.println(Thread.currentThread().getName() + " обрабатывает элемент [" + i + "] = " + value);
            result.add(value);
        }
    }
}
