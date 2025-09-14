package practice_11.homework.task_8;

import java.util.Arrays;

public class FindSecondMaxTask {
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }
}
