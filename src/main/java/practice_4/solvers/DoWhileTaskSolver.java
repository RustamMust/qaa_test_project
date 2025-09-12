package practice_4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void guessNumber(int bound) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = new Random().nextInt(bound);
        int userNumber;

        do {
            System.out.print("Угадайте число от 0 до " + (bound - 1) + ": ");
            userNumber = scanner.nextInt();

            if (userNumber != randomNumber) {
                System.out.println("Не угадали, попробуйте ещё раз.");
            }
        } while (userNumber != randomNumber);

        System.out.println("Верно. Программа завершена.");


    }

    public static void findMin() {
        Scanner scanner = new Scanner(System.in);

        int userNumber;
        int min = 100;
        do {
            System.out.print("Введите число (отрицательное для выхода): ");
            userNumber = scanner.nextInt();
            if (userNumber < min && userNumber >= 0) min = userNumber;
        } while (userNumber >= 0);

        System.out.println("Минимальное число: " + min);
    }

    public static void checkCredentials() {
        Scanner scanner = new Scanner(System.in);

        String login;
        String password;

        do {
            System.out.print("Введите логин: ");
            login = scanner.nextLine();
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
        } while (!login.equals("admin") || !password.equals("123"));

        System.out.println("Логин или пароль правильный.");

    }
}
