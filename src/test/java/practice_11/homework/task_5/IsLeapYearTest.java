package practice_11.homework.task_5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest {
    IsLeapYearTask isLeapYearTask = new IsLeapYearTask();

    @ParameterizedTest
    @ValueSource(ints = {2019, 2021, 2022})
    public void userCanCheckRegularNonLeapYear(int initialYear) {
        boolean expectedIsLeapResult = isLeapYearTask.isLeapYear(initialYear);

        assertFalse(expectedIsLeapResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    public void userCanCheckRegularLeapYear(int initialYear) {
        boolean expectedIsLeapResult = isLeapYearTask.isLeapYear(initialYear);

        assertTrue(expectedIsLeapResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2100})
    public void userCanCheckYearsThatDividedOnHundred(int initialYear) {
        boolean expectedIsLeapResult = isLeapYearTask.isLeapYear(initialYear);

        assertFalse(expectedIsLeapResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 4, 400})
    public void userCanCheckLeapYear(int initialYear) {
        boolean expectedIsLeapResult = isLeapYearTask.isLeapYear(initialYear);

        assertTrue(expectedIsLeapResult);
    }


}
