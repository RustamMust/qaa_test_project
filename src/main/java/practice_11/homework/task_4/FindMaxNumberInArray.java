package practice_11.homework.task_4;

import java.util.Arrays;

public class FindMaxNumberInArray {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
