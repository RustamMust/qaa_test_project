package practice_11.homework.task_18;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GcdTest {
    GcdTask gcdTask = new GcdTask();

    public static Stream<Arguments> initialNumbers() {
        return Stream.of(
                Arguments.of(24, 36, 12),
                Arguments.of(101, 103, 1),
                Arguments.of(0, 10, 10)
        );
    }
    @ParameterizedTest
    @MethodSource("initialNumbers")
    public void userCanCheckGcdNumber(int firstNumber, int secondNumber, int expectedDivisor) {
        int actualResult = gcdTask.gcd(firstNumber, secondNumber);

        assertEquals(expectedDivisor, actualResult);
    }
}
