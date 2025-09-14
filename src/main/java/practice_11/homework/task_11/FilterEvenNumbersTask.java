package practice_11.homework.task_11;

import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbersTask {
    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

}
