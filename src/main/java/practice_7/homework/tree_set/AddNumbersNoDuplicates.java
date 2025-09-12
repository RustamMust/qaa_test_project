package practice_7.homework.tree_set;

import java.util.TreeSet;

public class AddNumbersNoDuplicates {
    TreeSet<Integer> set;

    public AddNumbersNoDuplicates() {
        this.set = new TreeSet<>();
    }

    public void addNumbers(Integer number) {
        set.add(number);
    }

    public void printSet() {
        System.out.println("TreeSet без дубликатов: " + set);
    }
}
