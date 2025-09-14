package practice_11.homework.task_13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsStringAnagramTest {
    IsStringAnagramTask isStringAnagramTask = new IsStringAnagramTask();

    @Test
    public void userCanCheckIsStringAnagramValidString() {
        String initialString1 = "listen";
        String initialString2 = "silent";

        boolean expectedAnagramResult = true;
        boolean actualAnagramResult = isStringAnagramTask.isAnagram(initialString1, initialString2);

        assertEquals(expectedAnagramResult, actualAnagramResult);
    }


    public static Stream<Arguments> initialNotValidStrings() {
        return Stream.of(
                Arguments.of("java", "python"),
                Arguments.of(null, "word"),
                Arguments.of("python", null)
        );
    }

    @ParameterizedTest
    @MethodSource("initialNotValidStrings")
    public void userCanCheckIsStringAnagramNotValidString(String initialString1, String initialString2) {
        boolean expectedAnagramResult = false;
        boolean actualAnagramResult = isStringAnagramTask.isAnagram(initialString1, initialString2);

        assertEquals(expectedAnagramResult, actualAnagramResult);
    }
}
