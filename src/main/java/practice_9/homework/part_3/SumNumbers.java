package practice_9.homework.part_3;

import java.util.Arrays;
import java.util.List;

public class SumNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5);

        Integer sumNumber = numbers.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println(numbers);
        System.out.println(sumNumber);
    }
}
