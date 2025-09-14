package practice_11.homework.task_20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HasDuplicatesTest {
    HasDuplicatesTask hasDuplicatesTask = new HasDuplicatesTask();

    @Test
    public void userCanCheckListWithDuplicates() {
        int[] initialNumbers = {1, 2, 2, 3};

        boolean actualHasDuplicatesResult = hasDuplicatesTask.hasDuplicates(initialNumbers);

        assertTrue(actualHasDuplicatesResult);
    }

    @Test
    public void userCanCheckListWithoutDuplicates() {
        int[] initialNumbers = {1, 2, 3, 4, 5};

        boolean actualHasDuplicatesResult = hasDuplicatesTask.hasDuplicates(initialNumbers);

        assertFalse(actualHasDuplicatesResult);
    }

    @Test
    public void userCanCheckDuplicatesEmptyList() {
        int[] initialNumbers = {};

        boolean actualHasDuplicatesResult = hasDuplicatesTask.hasDuplicates(initialNumbers);

        assertFalse(actualHasDuplicatesResult);
    }
}
