package practice_7.homework.tree_set;

import java.util.TreeSet;

public class ClosestNumber {
    TreeSet<Integer> set;

    public ClosestNumber() {
        this.set = new TreeSet<>();
    }

    public void addNumbers(Integer number) {
        set.add(number);
    }

    public void printHigherValue(int number) {
        Integer higherNumber = set.higher(number);
        if (higherNumber != null) {
            System.out.println("Большее число: " + higherNumber);
        } else {
            System.out.println("Нет большего числа.");
        }
    }

    public void printLowerValue(int number) {
        Integer lowerValue = set.lower(number);
        if (lowerValue != null) {
            System.out.println("Меньшее число: " + lowerValue);
        } else {
            System.out.println("Нет меньшего числа.");
        }
    }
}
