package practice_11.homework.task_8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTest {
    FindSecondMaxTask findSecondMaxTask = new FindSecondMaxTask();

    public static Stream<Arguments> validArray() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 5),
                Arguments.of(new int[]{2, 4, 6, 8}, 6)
        );
    }


    @ParameterizedTest
    @MethodSource("validArray")
    public void userCanCheckSecondMaxNumber(int[] numbers, int expectedMaxNumber) {
        int actualNumber = findSecondMaxTask.findSecondMax(numbers);

        assertEquals(expectedMaxNumber, actualNumber);
    }

    @Test
    public void userCannotCheckSecondMaxNumberInArrayWithSameNumbers() {
        assertThrows(NoSuchElementException.class, () -> {
            findSecondMaxTask.findSecondMax(new int[]{4, 4, 4, 4});
                }
        );
    }

    @Test
    public void userCannotCheckSecondMaxNumberInArrayWithOneNumber() {
        assertThrows(NoSuchElementException.class, () -> {
                    findSecondMaxTask.findSecondMax(new int[]{8});
                }
        );
    }

    @Test
    public void userCannotCheckSecondMaxNumberInEmptyArray() {
        assertThrows(NoSuchElementException.class, () -> {
                    findSecondMaxTask.findSecondMax(new int[]{});
                }
        );
    }
}
