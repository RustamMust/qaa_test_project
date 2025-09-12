package practice_4.homework;

import java.util.Scanner;

public class DoWhileSolver {
    public void checkPositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int userNumber;
        do {
            System.out.print("Введите положительное число: ");
            userNumber = scanner.nextInt();
        } while (userNumber < 0);
    }

    public void checkValidPassword() {
        Scanner scanner = new Scanner(System.in);

        String validPassword = "admin";
        String userPassword;
        do {
            System.out.print("Введите пароль: ");
            userPassword = scanner.nextLine();
        } while (!userPassword.equals(validPassword));

    }


    public void numbersTo10() {
        int i = 1;

        do {
            System.out.println(i);
            i ++;
        } while (i <=10);
    }

    public void checkExitCommand() {
        Scanner scanner = new Scanner(System.in);

        String exitCommand = "exit";
        String userCommand;
        do {
            System.out.print("Введите команду: ");
            userCommand = scanner.nextLine();
        } while (!userCommand.equals(exitCommand));

    }

    public void checkNumberDigits() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();
        int initialNumber = userNumber;

        int countDigits = 0;

        if (userNumber == 0){
            System.out.println("Сумма цифр числа " + initialNumber + " = " + countDigits);
            return;
        }

        do {
            int currentNumber = userNumber / 10;
            countDigits++;
            userNumber = currentNumber;
        } while (userNumber > 0);

        System.out.println("Сумма цифр числа " + initialNumber + " = " + countDigits);

    }


}
