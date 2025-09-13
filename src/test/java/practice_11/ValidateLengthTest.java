package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidateLengthTest extends StringProcessorTest {
    /**
     * Тесты на валидацию длины строки
     * позитивные сценарии:
     *      - "abba", minLength 3 -> "abba"
     *      - "abba", minLength 4 -> "abba"
     * негативные сценарии:
     *      - "abba", minLength 5 -> IllegalArgumentException
     * угловые сценарии:
     *      - "abba", minLength 0 -> "abba"
     *      - "", minLength 0 -> ""
     *      - "hello", minLength -1 -> IllegalArgumentException
     */

    public static Stream<Arguments> stringForValidationPositiveCases() {
        return Stream.of(
                Arguments.of("abba", 3),
                Arguments.of("abba", 4),
                Arguments.of("abba", 0),
                Arguments.of("", 0)
        );
    }

    public static Stream<Arguments> stringForValidationNegativeCases() {
        return Stream.of(
                Arguments.of("abba", 5),
                Arguments.of("hello", -1)
        );
    }

    @ParameterizedTest
    @MethodSource("stringForValidationPositiveCases")
    public void userCanValidateStringWithLengthMoreOrEqualToMinValue(String initalString, int minValue) {
        String expectedResult  = stringProcessor.validateLength(initalString, minValue);

        assertEquals(expectedResult, initalString);
    }

    @ParameterizedTest
    @MethodSource("stringForValidationNegativeCases")
    public void userCannotValidateStringWithLengthLessThanMinValue(String initalString, int minValue) {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.validateLength(initalString, minValue);
                }, "String with length less than min value should lead to IllegalArgumentException."
        );
    }
}
