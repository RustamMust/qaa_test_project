package practice_11.homework.task_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidPhoneNumberTest {
    IsValidPhoneNumber isValidPhoneNumber = new IsValidPhoneNumber();


    public static Stream<Arguments> validPhoneNumbers() {
        return Stream.of(
                Arguments.of("+1 1234567890", true),
                Arguments.of("+44 9876543210", true),
                Arguments.of("+999 1111111111", true)

        );
    }

    public static Stream<Arguments> inValidPhoneNumbers() {
        return Stream.of(
                Arguments.of("12345", false),
                Arguments.of("invalid", false),
                Arguments.of("+1 abcdefghij", false),
                Arguments.of("+1234 1234567890", false),
                Arguments.of("+1 123", false),
                Arguments.of("", false)

        );
    }

    @ParameterizedTest
    @MethodSource("validPhoneNumbers")
    public void userCanCheckValidPhoneNumber(String phoneNumber, boolean expectedIsValid) {
        boolean actualIsValid = isValidPhoneNumber.isValidPhoneNumber(phoneNumber);

        assertEquals(expectedIsValid, actualIsValid);
    }

    @ParameterizedTest
    @MethodSource("inValidPhoneNumbers")
    public void userCanCheckInValidPhoneNumber(String phoneNumber, boolean expectedIsValid) {
        boolean actualIsValid = isValidPhoneNumber.isValidPhoneNumber(phoneNumber);

        assertEquals(expectedIsValid, actualIsValid);
    }

    @Test
    public void userCannotCheckInValidNullPhoneNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            isValidPhoneNumber.isValidPhoneNumber(null);
                }
        );
    }
}
