package practice_11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest extends StringProcessorTest{
    /**
     * Тесты для проверки, является ли строка палиндромом
     * позитивные кейсы:
     *      - четное количество "abba" -> true
     *      - нечетное количество "hah" -> true
     * негативные тесты:
     *      - "john" -> false
     * corner cases:
     *      - "a" -> true
     *      - "" -> true
     *      - null -> IllegalArgumentException
     */

    @ParameterizedTest
    @ValueSource(strings = {"abba", "hah", "a", ""})
    public void userCanCheckIfValidStringIsPalindrome(String initialString) {
        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertTrue(actualResult);

    }

    @Test
    public void userCanCheckIfValidStringIsNotPalindrome() {
        String intialString = "john";

        boolean actualResult = stringProcessor.isPalindrome(intialString);

        assertFalse(actualResult);
    }

    @Test
    public void userCannotCheckIfNullStringIsPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> {
                    stringProcessor.reverse(null);
                }, "Checking if null is palindrome should lead to IllegalArgumentException."
        );
    }
}
