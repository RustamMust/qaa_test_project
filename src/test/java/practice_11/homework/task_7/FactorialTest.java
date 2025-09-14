package practice_11.homework.task_7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    FactorialTask factorialTask = new FactorialTask();

    @Test
    public void userCanCheckFactorialOfZeroNumber () {
        int actualResult = factorialTask.factorial(0);

        int expectedNumber = 1;

        assertEquals(expectedNumber, actualResult);
    }

    public static Stream<Arguments> initialNumbersForFactorial() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040)
        );
    }

    @ParameterizedTest
    @MethodSource("initialNumbersForFactorial")
    public void userCanCheckFactorialOfPositiveNumber (int initialNumber ,int expectedNumber) {
        int actualResult = factorialTask.factorial(initialNumber);

        assertEquals(expectedNumber, actualResult);
    }

    @Test
    public void userCannotCheckFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            factorialTask.factorial(-3);;
                }
        );
    }

}
