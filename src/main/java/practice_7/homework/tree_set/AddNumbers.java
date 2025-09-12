package practice_7.homework.tree_set;

import java.util.TreeSet;

public class AddNumbers {
    TreeSet<Integer> numbers;

    public AddNumbers() {
        this.numbers = new TreeSet<>();
    }

    public void addNumbersToSet(Integer number) {
        numbers.add(number);
    }

    public void printNumbers() {
        System.out.println("TreeSet: " + numbers);
    }
}
