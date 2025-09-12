package practice_9.homework.part_1;

import java.util.function.Predicate;

public class PredicateIsEvenTask {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;

        int number1 = 4;
        int number2 = 1;

        System.out.println("isEven for number " + number1 + ": " + isEven.test(number1));
        System.out.println("isEven for number " + number2 + ": " + isEven.test(number2));
    }
}
