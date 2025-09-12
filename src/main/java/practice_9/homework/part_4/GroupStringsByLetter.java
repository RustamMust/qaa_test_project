package practice_9.homework.part_4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLetter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "cat1", "dog", "dog2", "letter", "road");

        Map<Character, List<String>> groupedStrings = strings.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(strings);
        System.out.println(groupedStrings);
    }
}
