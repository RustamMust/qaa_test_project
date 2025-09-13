package practice_11.homework.task_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
    ReverseStringTask reverseStringTask = new ReverseStringTask();


    public static Stream<Arguments> validStringToReverse() {
        return Stream.of(
                Arguments.of("hello", "olleh"),
                Arguments.of("Java", "avaJ"),
                Arguments.of("", ""),
                Arguments.of("a", "a"),
                Arguments.of("12345", "54321"),
                Arguments.of(null, null)
        );
    }


    @ParameterizedTest
    @MethodSource("validStringToReverse")
    public void userCanReverseValidString(String initialString, String expectedString) {
        String reversedString = reverseStringTask.reverse(initialString);

        assertEquals(expectedString, reversedString);

    }
}
