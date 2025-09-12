package practice_8.homework.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // 1. Обработка проверяемого исключения
        try {
            FileReader reader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }

        // 2. Обработка непроверяемого исключения
        divideNumbers(4, 2);


        // 3. Создание и использование собственного проверяемого исключения
        try {
            checkValidAge(160);
        } catch (AgeException e) {
            throw new RuntimeException(e);
        }

        // 4. Создание и использование собственного непроверяемого исключения
        try {
            checkValidAddress("простой адрес");
        } catch (InvalidAdressException e) {
            System.out.println("Перехватили исключение.");
        }



    }

    public static void divideNumbers(int number1, int number2) {
        try {
            int result = number1 / number2;
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя.");
        }
    }

    public static void checkValidAge(int age) throws AgeException {
        if (age < 0 || age > 150) {
            throw new AgeException("Возраст меньше 0 или больше 150.");
        }
    }

    public static void checkValidAddress(String address) throws InvalidAdressException {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(address);

        if (!matcher.matches()) {
            throw new InvalidAdressException("Неправильный адрес.");
        }

        System.out.println("Адрес правильный.");

    }
}
