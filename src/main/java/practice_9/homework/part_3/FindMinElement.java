package practice_9.homework.part_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMinElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 6, 7, 8, 10);

        Integer minNumber = numbers.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println(numbers);
        System.out.println(minNumber);
    }
}
