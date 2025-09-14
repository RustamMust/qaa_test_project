package practice_11.homework.task_19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidJsonTest {
    IsValidJsonTask isValidJsonTask = new IsValidJsonTask();

    @Test
    public void userCanCheckValidJson() {
        String initialJson = "{\"key\":\"value\"}";

        boolean actualValidResult = isValidJsonTask.isValidJson(initialJson);

        assertTrue(actualValidResult);
    }

    @Test
    public void userCanCheckNotValidJson() {
        String initialJson = "invalid json";

        boolean actualValidResult = isValidJsonTask.isValidJson(initialJson);

        assertFalse(actualValidResult);
    }

    @Test
    public void userCanCheckNullJson() {
        String initialJson = null;

        boolean actualValidResult = isValidJsonTask.isValidJson(initialJson);

        assertFalse(actualValidResult);
    }
}
