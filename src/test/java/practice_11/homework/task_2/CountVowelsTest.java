package practice_11.homework.task_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest {
    CountVowelsTask countVowelsTask = new CountVowelsTask();


    public static Stream<Arguments> stringsPositiveCases() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("", 0),
                Arguments.of("bcdfg", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("stringsPositiveCases")
    public void userCanCountVowelsInString(String initialString, int expectedNumberOfVowels) {
        int actualNumberOfVowels = countVowelsTask.countVowels(initialString);

        assertEquals(expectedNumberOfVowels, actualNumberOfVowels);
    }

    @Test
    public void userCanNotCountVowelsInString () {
        assertThrows(IllegalArgumentException.class, () -> {
            countVowelsTask.countVowels(null);
                }, "Count of vowels null should lead to IllegalArgumentException."
        );
    }
}
