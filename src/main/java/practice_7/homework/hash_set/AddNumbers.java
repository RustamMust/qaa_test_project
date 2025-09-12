package practice_7.homework.hash_set;

import java.util.HashSet;

public class AddNumbers {
    HashSet<Integer> numbers;

    public AddNumbers() {
        this.numbers = new HashSet<>();
    }

    public void addNumbersToHashSet(Integer newNumber) {
        numbers.add(newNumber);
    }

    public void containsNumber(Integer number) {
        if (numbers.contains(number)){
            System.out.println("Число " + number +  " есть в HashSet");
        } else {
            System.out.println("Числа " + number + " нет в HashSet");
        }
    }
}
