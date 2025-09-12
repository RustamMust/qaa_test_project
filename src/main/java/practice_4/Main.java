package practice_4;

import practice_4.solvers.*;

public class Main {
    public static void main(String[] args) {
        IfElseTaskSolver ifElseTaskSolver = new IfElseTaskSolver();

        // Проверка метода четности
        String result = ifElseTaskSolver.checkParity(15);
        System.out.println(result);

        String result2 = ifElseTaskSolver.checkParity(4);
        System.out.println(result2);

        // Проверка метода определения возраста
        String ageCheck1 = ifElseTaskSolver.checkAge(18);
        System.out.println(ageCheck1);

        String ageCheck2 = ifElseTaskSolver.checkAge(65);
        System.out.println(ageCheck2);

        // Проверка метода по нахождению max среди трех чисел
        int maxNumber = ifElseTaskSolver.checkMax(1,2,4);
        System.out.println(maxNumber);

        int maxNumber2 = ifElseTaskSolver.checkMax(5,3,14);
        System.out.println(maxNumber2);

        SwitchTaskSolver switchTaskSolver = new SwitchTaskSolver();

        // Проверка метода возвращающего день недели по числу
        String day1 = switchTaskSolver.dayOfWeek(7);
        System.out.println(day1);

        String day2 = switchTaskSolver.dayOfWeek(26);
        System.out.println(day2);

        // Проверка метода по описанию сезона
        String season1 = switchTaskSolver.describeSeason(Season.WINTER);
        System.out.println(season1);

        String season2 = switchTaskSolver.describeSeason(Season.SUMMER);
        System.out.println(season2);


        // Проверка таблицы умножения для числа
        ForTaskSolver.multiplyTable(10);

        // Проверка суммы всех чисел до числа
        int sum1 = ForTaskSolver.sumOfAllNumbers(7);
        System.out.println(sum1);

        // Проверка метода по определению простого числа
        boolean isSimple1 = ForTaskSolver.checkNumberIsSimple(3);
        System.out.println(isSimple1);

        boolean isSimple2 = ForTaskSolver.checkNumberIsSimple(8);
        System.out.println(isSimple2);

        // Проверка метода по распечатке всех простых чисел до 100
        ForTaskSolver.printAllSimpleNumbersBefore100();

        // Проверка метода по распечатке всех чисел от 1 до 10
        WhileTaskSolver.printAllNumbersBefore10();

        // Проверка метода ожидания слова exit в консоли
        WhileTaskSolver.commandReader();

        // Проверка метода суммы цифр числа
        WhileTaskSolver.sumOfDigits(123);
        WhileTaskSolver.sumOfDigits(1101);

        // Проверка метода по угадыванию рандом числа
        DoWhileTaskSolver.guessNumber(3);

        // Проверка метода по поиску минимального введенного числа
        DoWhileTaskSolver.findMin();

        // Проверка метода по поиску логина и пароля
        DoWhileTaskSolver.checkCredentials();

    }
}
