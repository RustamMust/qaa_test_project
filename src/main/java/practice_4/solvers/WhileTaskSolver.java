package practice_4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void printAllNumbersBefore10() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void commandReader() {
        Scanner scanner = new Scanner(System.in);

        String command = "";

        while (!command.equals("exit")) {
            System.out.print("Введите команду exit: ");
            command = scanner.nextLine();

            if (!command.equals("exit")) {
                System.out.println("Слово не exit.");
            }
        }

        System.out.println("Спасибо. Программа завершена.");

    }

    public static void sumOfDigits(int number) {
        int initialNumber = number;
        int sum = 0;

        while (number > 0) {
            int current_number = number % 10;
            sum+=current_number;
            number = number / 10;
        }

        System.out.println("Сумма цифр числа " + initialNumber + " = " + sum);
    }
}
