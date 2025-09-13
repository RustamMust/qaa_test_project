package practice_11.homework.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEvenTest {
    IsEvenTask isEvenTask = new IsEvenTask();

    @Test
    public void userCanCheckPositiveEvenNumber() {
        boolean actualResult = isEvenTask.isEven(4);

        assertTrue(actualResult);
    }

    @Test
    public void userCanCheckPositiveNotEvenNumber() {
        boolean actualResult = isEvenTask.isEven(5);

        assertFalse(actualResult);
    }

    @Test
    public void userCanCheckNegativeEvenNumber() {
        boolean actualResult = isEvenTask.isEven(-4);

        assertTrue(actualResult);
    }

    @Test
    public void userCanCheckNegativeNotEvenNumber() {
        boolean actualResult = isEvenTask.isEven(-3);

        assertFalse(actualResult);
    }

    @Test
    public void userCanCheckZeroNumber() {
        boolean actualResult = isEvenTask.isEven(0);

        assertTrue(actualResult);
    }


}
