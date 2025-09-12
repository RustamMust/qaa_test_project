package practice_9.homework.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> squareNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(squareNumbers);
    }
}
