package practice_11.homework.task_15;

import java.util.List;
import java.util.stream.Collectors;

public class MapToLengthsTask {
    public List<Integer> mapToLengths(List<String> words) {
        return words.stream().map(String::length).collect(Collectors.toList());
    }
}
