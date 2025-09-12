package practice_9.homework.part_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 4, 6, 8, 10, 3);

        Integer maxNumber = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(numbers);
        System.out.println(maxNumber);
    }
}
