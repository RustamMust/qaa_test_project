package practice_9.homework.part_3;

import java.util.Arrays;
import java.util.List;

public class FindMatchElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        boolean matchedNumber = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(numbers);
        System.out.println(matchedNumber);
    }
}
