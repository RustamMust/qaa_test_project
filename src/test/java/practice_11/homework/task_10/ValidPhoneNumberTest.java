package practice_11.homework.task_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ValidPhoneNumberTest {
    IsValidPhoneNumber isValidPhoneNumber = new IsValidPhoneNumber();

    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890", "+44 9876543210", "+999 1111111111"})
    public void userCanCheckValidPhoneNumber(String phoneNumber) {
        boolean actualIsValid = isValidPhoneNumber.isValidPhoneNumber(phoneNumber);

        assertTrue(actualIsValid);
    }

    @ParameterizedTest
    @ValueSource(strings = {"12345", "invalid", "+1 abcdefghij", "+1234 1234567890", "+1 123", ""})
    public void userCanCheckInValidPhoneNumber(String phoneNumber) {
        boolean actualIsValid = isValidPhoneNumber.isValidPhoneNumber(phoneNumber);

        assertFalse(actualIsValid);
    }

    @Test
    public void userCannotCheckInValidNullPhoneNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            isValidPhoneNumber.isValidPhoneNumber(null);
                }
        );
    }
}
