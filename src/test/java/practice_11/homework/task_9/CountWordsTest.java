package practice_11.homework.task_9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest {
    CountWordsInStringTask countWordsInStringTask = new CountWordsInStringTask();

    public static Stream<Arguments> validInitialString() {
        return Stream.of(
                Arguments.of("Hello world", 2),
                Arguments.of(" Java is awesome ", 3),
                Arguments.of("", 0),
                Arguments.of(" ", 0)

        );
    }

    @ParameterizedTest
    @MethodSource("validInitialString")
    public void userCanCountWordsInString(String initialString, int expectedNumberOfWords) {
        int actualNumberOfWords = countWordsInStringTask.countWords(initialString);

        assertEquals(expectedNumberOfWords, actualNumberOfWords);
    }

    @Test
    public void userCannotCountWordsInNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            countWordsInStringTask.countWords(null);
                }
        );
    }
}
