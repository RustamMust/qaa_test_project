package practice_11.homework.task_11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterEvenNumbersTest {
    FilterEvenNumbersTask filterEvenNumbersTask = new FilterEvenNumbersTask();

    @Test
    public void userCanFilterArrayWithEvenNumbers() {
        List<Integer> initialNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> expectedNumbers = Arrays.asList(2, 4, 6);

        List<Integer> actualNumbers = filterEvenNumbersTask.filterEvenNumbers(initialNumbers);

        assertEquals(expectedNumbers, actualNumbers);
    }

    @Test
    public void userCanFilterArrayWithoutEvenNumbers() {
        List<Integer> initialNumbers = Arrays.asList(1, 3, 5);

        List<Integer> expectedNumbers = List.of();

        List<Integer> actualNumbers = filterEvenNumbersTask.filterEvenNumbers(initialNumbers);

        assertEquals(expectedNumbers, actualNumbers);
    }

    @Test
    public void userCanFilterEmptyArrayWithoutEvenNumbers() {
        List<Integer> initialNumbers = List.of();

        List<Integer> expectedNumbers = List.of();

        List<Integer> actualNumbers = filterEvenNumbersTask.filterEvenNumbers(initialNumbers);

        assertEquals(expectedNumbers, actualNumbers);
    }
}
