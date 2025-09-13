package practice_11.homework.task_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxNumberTest {
    private FindMaxNumberInArray findMaxNumberInArray;

    @BeforeEach
    void setUpTest() {
        findMaxNumberInArray = new FindMaxNumberInArray();
    }

    public static Stream<Arguments> validArray() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{-3, -5, -7, -2}, -2)
        );
    }

    @ParameterizedTest
    @MethodSource("validArray")
    public void userCanFindMaxNumberInValidArray(int[] numbers, int expectedMaxNumber) {
        int actualMaxNumber = findMaxNumberInArray.findMax(numbers);

        assertEquals(expectedMaxNumber, actualMaxNumber);
    }

    @Test
    public void userCannotFindMaxNumberFromEmptyArray() {
        assertThrows(NoSuchElementException.class, () -> {
            findMaxNumberInArray.findMax(new int[]{});
                }
        );
    }

    @Test
    public void userCannotFindMaxNumberFromNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
                    findMaxNumberInArray.findMax(null);
                }
        );
    }
}
