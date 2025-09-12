package practice_4.homework;

import java.util.Scanner;

public class SwitchCaseSolver {
    public void checkDayOfWeekByNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 7: ");
        int userNumber = scanner.nextInt();

        String dayOfTheWeek = "";

        switch (userNumber) {
            case 1:
                dayOfTheWeek = "Понедельник";
                break;
            case 2:
                dayOfTheWeek = "Вторник";
                break;
            case 3:
                dayOfTheWeek = "Среда";
                break;
            case 4:
                dayOfTheWeek = "Четверг";
                break;
            case 5:
                dayOfTheWeek = "Пятница";
                break;
            case 6:
                dayOfTheWeek = "Суббота";
                break;
            case 7:
                dayOfTheWeek = "Воскресенье";
            default:
                dayOfTheWeek = "Неправильное число.";
        }

        System.out.println("День недели: " + dayOfTheWeek);
    }

    public void checkCostOfTicketByWeekDay() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число (день недели) от 1 до 7: ");
        int userNumber = scanner.nextInt();

        String notWeekendDay = "300 рублей";
        String weekendDay = "450 рублей";
        String dayOfTheWeek = "";

        switch (userNumber) {
            case 1, 2, 3, 4, 5:
                dayOfTheWeek = notWeekendDay;
                break;
            case 6, 7:
                dayOfTheWeek = weekendDay;
                break;
            default:
                dayOfTheWeek = "Неправильное число.";
        }

        System.out.println("Стоимость билета: " + dayOfTheWeek);

    }

    public void convertNumberToLetter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 0 до 100: ");
        int userNumber = scanner.nextInt();

        String letter = "";

        switch (userNumber) {
            case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100:
                letter = "A";
                break;
            case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89:
                letter = "B";
                break;
            case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79:
                letter = "C";
                break;
            case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69:
                letter = "D";
                break;
            default:
                letter = "F";
        }

        System.out.println("Оценка: " + letter);
    }

    public void checkTextCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите одно из слов 'start, stop, restart, status': ");
        String userCommand = scanner.nextLine();

        String command = "";

        switch (userCommand) {
            case "start":
                command = "Система стартовала";
                break;
            case "stop":
                command = "Система остановилась";
                break;
            case "restart":
                command = "Система рестартовала";
                break;
            case "status":
                command = "Получение статуса системы";
                break;
            default:
                command = "Неизвестная команда";
        }
        System.out.println(command);

    }

    public void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int userNumber1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int userNumber2 = scanner.nextInt();

        System.out.print("Введите оператор '+, -, *, /': ");
        String userCommand = scanner.next();

        int result = 0;

        switch (userCommand) {
            case "+":
                result = userNumber1 + userNumber2;
                break;
            case "-":
                result = userNumber1 - userNumber2;
                break;
            case "*":
                result = userNumber1 * userNumber2;
                break;
            case "/":
                if (userNumber2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено.");
                    return;
                }
                result = userNumber1 / userNumber2;
                break;
        }
        System.out.println(result);
    }
}
