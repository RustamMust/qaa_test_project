package practice_4.homework;

import java.util.Scanner;

public class BreakContinueSolver {
    public void sumPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        int sumNumber = 0;

        while (true) {
            System.out.print("Введите число: ");
            int userNumber = scanner.nextInt();

            if (userNumber < 0) {
                break;
            }
            sumNumber+=userNumber;

        }
        System.out.println("Сумма чисел: " + sumNumber);
    }

    public void skipNumbers() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }

    public void skipNonPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            System.out.print("Введите число: ");
            int userNumber = scanner.nextInt();

            if (userNumber < 0) {
                System.out.println("Пропускаем неположительное число.");
                i++;
                continue;
            }
            System.out.println("Положительное число: " + userNumber);
            i++;
        }

    }

    public void checkStop() {
        Scanner scanner = new Scanner(System.in);

        String stopCommand = "stop";


        while (true) {
            System.out.print("Введите строку: ");
            String userCommand = scanner.nextLine();
            if (userCommand.equals(stopCommand)) {
                break;
            }
        }

    }

}
