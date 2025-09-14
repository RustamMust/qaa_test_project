package practice_11.homework.task_15;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapToLengthsTest {
    MapToLengthsTask mapToLengthsTask = new MapToLengthsTask();

    @Test
    public void userCanCovertMapToLength() {
        List<String> initialStrings = Arrays.asList("Java", "C++", "Go");
        List<Integer> expectedLength = Arrays.asList(4, 3, 2);

        List<Integer> actualLength = mapToLengthsTask.mapToLengths(initialStrings);

        assertEquals(expectedLength, actualLength);
    }

    @Test
    public void userCanCovertMapToLengthEmptyList() {
        List<String> initialStrings = List.of();
        List<Integer> expectedLength = List.of();

        List<Integer> actualLength = mapToLengthsTask.mapToLengths(initialStrings);

        assertEquals(expectedLength, actualLength);
    }
}
