package practice_11.homework.task_6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidEmailTest {
    IsValidEmailTask isValidEmailTask = new IsValidEmailTask();

    @ParameterizedTest
    @ValueSource(strings = {"test@example.com", "user.name@domain.co", "a@b.cc"})
    public void userCanCheckValidEmail(String email) {
        boolean actualEmail = isValidEmailTask.isValidEmail(email);

        assertTrue(actualEmail);
    }

    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol", "@missing-user.com", "user@domain"})
    public void userCanCheckInValidEmail(String email) {
        boolean actualEmail = isValidEmailTask.isValidEmail(email);

        assertFalse(actualEmail);
    }

    @Test
    public void userCanCheckEmptyStringEmail() {
        boolean actualEmail = isValidEmailTask.isValidEmail("");

        assertFalse(actualEmail);
    }

    @Test
    public void userCanCheckNullEmail() {
        boolean actualEmail = isValidEmailTask.isValidEmail(null);

        assertFalse(actualEmail);
    }
}
