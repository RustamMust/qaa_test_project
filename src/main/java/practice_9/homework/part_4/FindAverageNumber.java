package practice_9.homework.part_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAverageNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Double averageNumber = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));

        System.out.println(numbers);
        System.out.println(averageNumber);
    }
}
