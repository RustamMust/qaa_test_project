package practice_9.homework.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 1, 1, 4, 3, 2, 5);

        List<Integer> numbersWithoutDuplicates = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(numbersWithoutDuplicates);
    }
}
