package practice_9.homework.part_3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementStartsWith {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("кошка", "Борис", "машина", "собака", "дорога");

        Optional elementStartsWith = strings.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();

        System.out.println(strings);
        System.out.println(elementStartsWith);
    }
}
