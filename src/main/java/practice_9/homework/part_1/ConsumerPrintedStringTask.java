package practice_9.homework.part_1;

import java.util.function.Consumer;

public class ConsumerPrintedStringTask {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println(s);

        printer.accept("Hello");
        printer.accept("World");
    }
}
