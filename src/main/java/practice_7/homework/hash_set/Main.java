package practice_7.homework.hash_set;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.printHashSet();

        AddNumbers addNumbers = new AddNumbers();
        addNumbers.addNumbersToHashSet(1);
        addNumbers.addNumbersToHashSet(2);
        addNumbers.addNumbersToHashSet(3);
        addNumbers.addNumbersToHashSet(4);
        addNumbers.addNumbersToHashSet(5);
        addNumbers.addNumbersToHashSet(6);
        addNumbers.addNumbersToHashSet(7);
        addNumbers.addNumbersToHashSet(8);
        addNumbers.addNumbersToHashSet(9);
        addNumbers.addNumbersToHashSet(10);

        addNumbers.containsNumber(20);
        addNumbers.containsNumber(3);

        List<String> list = Arrays.asList("one", "two", "one", "two", "three", "one");
        Set<String> listWithoutDuplicates = RemoveDuplicates.removeDuplicates(list);

        System.out.println("С дупликатами: " + list);
        System.out.println("Без дупликатов: " + listWithoutDuplicates);

        ContainsName names = new ContainsName();
        names.addNameToHashSet("Petya");
        names.addNameToHashSet("Kolya");
        names.addNameToHashSet("Rustam");

        names.printContainsName("Petya");
        names.printContainsName("Vasya");


    }
}
