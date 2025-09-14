package practice_11.homework.task_17;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPasswordTest {
    ValidPasswordTask validPasswordTask = new ValidPasswordTask();

    @Test
    public void userCanCheckValidPassword() {
        String initialPassword = "Password1";
        boolean actualValid = validPasswordTask.isValidPassword(initialPassword);

        assertTrue(actualValid);
    }

    @ParameterizedTest
    @ValueSource(strings = {"pass", "password"})
    public void userCanCheckNotValidPassword(String initialPassword) {
        boolean actualValid = validPasswordTask.isValidPassword(initialPassword);

        assertFalse(actualValid);
    }

    @Test
    public void userCanCheckNullPassword() {
        String initialPassword = null;
        boolean actualValid = validPasswordTask.isValidPassword(initialPassword);

        assertFalse(actualValid);
    }
}
