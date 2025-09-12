package practice_9.homework.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 15, 12);

        List<Integer> divideNumbers = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(divideNumbers);
    }
}
