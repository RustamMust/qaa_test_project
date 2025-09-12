package practice_10.homework.task_6;

public class Result {
    private int count = 0;
    private int sum = 0;

    public synchronized void add(int value) {
        count++;
        sum+=value;
    }

    public synchronized int getCount() {
        return count;
    }

    public synchronized int getSum() {
        return sum;
    }


}
