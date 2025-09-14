package practice_11.homework.task_14;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindAverageTest {
    FindAverageTask findAverageTask = new FindAverageTask();

    @Test
    public void userCanCheckAverageNumberValidArray() {
        int[] initialNumbers = {1, 2, 3, 4, 5};
        double expectedNumber = 3.0;

        double actualNumber = findAverageTask.findAverage(initialNumbers);

        assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void userCanCheckAverageNumberArrayWithOneElement() {
        int[] initialNumbers = {10};
        double expectedNumber = 10.0;

        double actualNumber = findAverageTask.findAverage(initialNumbers);

        assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void userCannotCheckFactorialOfNegativeNumber() {
        assertThrows(NoSuchElementException.class, () -> {
            findAverageTask.findAverage(new int[]{});
        }
        );
    }
}
