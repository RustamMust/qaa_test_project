package practice_9.homework.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringsToLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "homework", "length", "class", "bike");

        List<Integer> convertedStrings = strings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(strings);
        System.out.println(convertedStrings);

    }
}
