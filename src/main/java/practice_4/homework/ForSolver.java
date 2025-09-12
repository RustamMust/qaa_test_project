package practice_4.homework;

import java.util.Scanner;

public class ForSolver {
    public void printNumbersFor3() {
        for (int i = 1; i<=100; i++) {
            if (i % 3 == 0) {
                System.out.println("Число делится на 3: " + i);
            }
        }
    }

    public void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= userNumber; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + userNumber + ": " + sum);
    }

    public void multiplyTableUserNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(userNumber + " x " + i + " = " + userNumber * i);
        }
    }

    public void simpleUserNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < userNumber - 1; i++) {
            if (userNumber % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Простое число: " + userNumber);
        } else {
            System.out.println("Число не простое: " + userNumber);
        }

    }

    public void numbersTo10() {
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }
    }
}
