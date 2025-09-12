package live_coding;

import java.util.List;

public class MaxFinder {
    public static int findMax(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("You can't pass such argument.");
        }

        int max = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        return max;

    }

    public static void main (String[] args) {
        System.out.println(findMax(List.of(1,2,3,4,5)));

    }
}
