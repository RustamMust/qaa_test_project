package practice_9.homework.part_1;

import java.util.function.Function;

public class FunctionGetLengthTask {
    public static void main(String[] args) {
        Function<String, Integer> getLength = s -> s.length();

        String string1 = "Hello";
        String string2 = "World!";

        int length1 = getLength.apply(string1);
        int length2 = getLength.apply(string2);

        System.out.println("Length of string " + string1 + ": " + length1);
        System.out.println("Length of string " + string2 + ": " + length2);

    }
}
