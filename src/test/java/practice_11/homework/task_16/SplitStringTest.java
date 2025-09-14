package practice_11.homework.task_16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitStringTest {
    SplitStringTask splitStringTask = new SplitStringTask();

    @Test
    public void userCanSplitStringWithDelimiter() {
        String initialString = "Java,Python,C++";
        String delimiter = ",";

        String[] expectedListStrings = {"Java", "Python", "C++"};

        String[] actualListStrings = splitStringTask.splitString(initialString, delimiter);

        assertArrayEquals(expectedListStrings, actualListStrings);
    }

    @Test
    public void userCanSplitStringWithDelimiterEmptyString() {
        String initialString = "";
        String delimiter = ",";

        String[] expectedListStrings = {""};

        String[] actualListStrings = splitStringTask.splitString(initialString, delimiter);

        assertArrayEquals(expectedListStrings, actualListStrings);
    }

    @Test
    public void userCanSplitStringWithoutDelimiter() {
        String initialString = "word";
        String delimiter = ",";

        String[] expectedListStrings = {"word"};

        String[] actualListStrings = splitStringTask.splitString(initialString, delimiter);

        assertArrayEquals(expectedListStrings, actualListStrings);
    }
}
