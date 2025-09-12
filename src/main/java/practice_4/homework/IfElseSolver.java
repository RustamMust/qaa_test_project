package practice_4.homework;

import java.util.Scanner;

public class IfElseSolver {
    public void checkSignOfNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();

        if (userNumber > 0) {
            System.out.println("Число положительное.");
        } else if (userNumber == 0) {
            System.out.println("Число равно нулю.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

    public void checkMaxOfTwoNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int userNumber1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int userNumber2 = scanner.nextInt();

        int maxNumber = userNumber1;

        if (userNumber2 > userNumber1) {
            maxNumber = userNumber2;
        }
        System.out.println("Максимальное число из двух введенных: " + maxNumber);
    }

    public void checkGradeNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 5: ");
        int userNumber = scanner.nextInt();

        if (userNumber == 5) {
            System.out.print("Отлично.");
        } else if (userNumber == 4) {
            System.out.print("Хорошо.");
        } else if (userNumber == 3) {
            System.out.print("Удовлетворительно.");
        } else {
            System.out.print("Неудовлетворительно.");
        }
    }

    public void checkNumberIsEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();

        if (userNumber % 2 == 0) {
            System.out.print("Введенное число четное.");
        } else {
            System.out.print("Введенное число нечетное.");
        }
    }

    public void checkDiscountByAge() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свой возраст: ");
        int userNumber = scanner.nextInt();

        if (userNumber < 18) {
            System.out.print("Скидка для вашего возраста: 25%.");
        } else if (userNumber >= 65) {
            System.out.print("Скидка для вашего возраста: 30%.");
        } else {
            System.out.print("Для вашего возраста не предусмотрена скидка.");
        }

    }

    public void checkResultByNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свой балл: ");
        int userNumber = scanner.nextInt();

        if (userNumber >= 90) {
            System.out.print("Отлично.");
        } else if (userNumber >= 75 && userNumber < 89) {
            System.out.print("Хорошо.");
        } else if (userNumber >= 60 && userNumber < 74) {
            System.out.print("Удовлетворительно.");
        } else {
            System.out.print("Неудовлетворительно.");
        }
    }

}
