package practice_11.homework.task_12;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortListByLengthTest {
    SortListByLengthTask sortListByLengthTask = new SortListByLengthTask();

    @Test
    public void userCanSortListValidArray() {
        List<String> initialStringArray = Arrays.asList("Java", "C", "Python");
        List<String> expectedStringArray = Arrays.asList("C", "Java", "Python");

        List<String> actualStringArray = sortListByLengthTask.sortByLength(initialStringArray);

        assertEquals(expectedStringArray, actualStringArray);
    }

    @Test
    public void userCanSortListValidArrayStringsWithSameLength() {
        List<String> initialStringArray = Arrays.asList("aa", "bb", "cc");
        List<String> expectedStringArray = Arrays.asList("aa", "bb", "cc");

        List<String> actualStringArray = sortListByLengthTask.sortByLength(initialStringArray);

        assertEquals(expectedStringArray, actualStringArray);
    }

    @Test
    public void userCanSortListValidEmptyArray() {
        List<String> initialStringArray = List.of();
        List<String> expectedStringArray = List.of();

        List<String> actualStringArray = sortListByLengthTask.sortByLength(initialStringArray);

        assertEquals(expectedStringArray, actualStringArray);
    }

}
