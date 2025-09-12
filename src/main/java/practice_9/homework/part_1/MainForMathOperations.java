package practice_9.homework.part_1;

public class MainForMathOperations {
    public static void main(String[] args) {
        MathOperations add = (a, b) -> a + b;
        MathOperations subtract = (a, b) -> a - b;
        MathOperations multiply = (a, b) -> a * b;
        MathOperations divide = (a, b) -> a / b;

        System.out.println(add.operate(4, 2));
        System.out.println(subtract.operate(5, 3));
        System.out.println(multiply.operate(2, 6));
        System.out.println(divide.operate(8, 4));
    }
}
