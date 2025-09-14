package practice_11.homework.task_20;

import java.util.Arrays;

public class HasDuplicatesTask {
    public boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
    }
}
