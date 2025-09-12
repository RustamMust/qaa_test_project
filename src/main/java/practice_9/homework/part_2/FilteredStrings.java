package practice_9.homework.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteredStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "dog", "homework", "class", "car", "flat");

        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println(strings);
        System.out.println(filteredStrings);

    }
}
