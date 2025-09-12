package practice_9.homework.part_4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNumbersByEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 10, 12, 15);

        Map<Boolean, List<Integer>> groupedNumber = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println(numbers);
        System.out.println(groupedNumber);
    }
}
