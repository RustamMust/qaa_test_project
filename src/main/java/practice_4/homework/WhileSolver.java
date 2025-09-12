package practice_4.homework;

import java.util.Scanner;

public class WhileSolver {
    public void factorialOfNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();

        int i = 1;
        int result = 1;
        while (i <= userNumber) {
            result*=i;
            i++;
        }
        System.out.println("Факториал числа " + userNumber + " = " + result);
    }

    public void evenNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();

        int i = 1;
        while (i <= userNumber) {
            if (i % 2 == 0) {
                System.out.println("Четное число: " + i);
            }
            i++;
        }

    }

    public void countDownNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();

        int i = 1;
        while (userNumber >=i) {
            System.out.println(userNumber);
            userNumber --;
        }
    }
}
