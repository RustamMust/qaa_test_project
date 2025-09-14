package practice_11.homework.task_14;

import java.util.Arrays;

public class FindAverageTask {
    public double findAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElseThrow();
    }
}
