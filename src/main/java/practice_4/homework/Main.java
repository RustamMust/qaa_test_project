package practice_4.homework;

public class Main {
    public static void main(String[] args) {
        // Задачи на if-else. 1. Определение знака числа
        IfElseSolver ifElseSolver = new IfElseSolver();
        ifElseSolver.checkSignOfNumber();

        // Задачи на if-else. 2. Поиск наибольшего из двух чисел
        ifElseSolver.checkMaxOfTwoNumbers();

        // Задачи на if-else. 3. Вывод оценки по шкале 1–5
        ifElseSolver.checkGradeNumber();

        // Задачи на if-else. 4. Проверка на чётность
        ifElseSolver.checkNumberIsEven();

        // Задачи на if-else. 5. Определение размера скидки по возрасту
        ifElseSolver.checkDiscountByAge();

        // Задачи на if-else. 6. Оценка результата теста по баллам
        ifElseSolver.checkResultByNumber();

        // Задачи на switch. 1. Вывод дня недели по номеру
        SwitchCaseSolver switchCaseSolver = new SwitchCaseSolver();
        switchCaseSolver.checkDayOfWeekByNumber();

        //Задачи на switch. 2. Стоимость билета по дню недели
        switchCaseSolver.checkCostOfTicketByWeekDay();

        //Задачи на switch. 3. Перевод числовых оценок в буквенные (A–F)
        switchCaseSolver.convertNumberToLetter();

        //Задачи на switch. 4. Обработка текстовых команд
        switchCaseSolver.checkTextCommand();

        //Задачи на switch. 5. Простой калькулятор с использованием switch
        switchCaseSolver.simpleCalculator();

        // Задачи на for. 1. Вывод чисел от 1 до 100, делящихся на 3
        ForSolver forSolver = new ForSolver();
        forSolver.printNumbersFor3();

        // Задачи на for. 2. Сумма чисел от 1 до n
        forSolver.sumOfNumbers();

        // Задачи на for. 3. Таблица умножения для числа
        forSolver.multiplyTableUserNumber();

        // Задачи на for. 4. Проверка на простое число
        forSolver.simpleUserNumber();

        // Задачи на for. 5. Вывод чисел от 1 до 10
        forSolver.numbersTo10();

        // Задачи на while. 1. Вычисление факториала с помощью while
        WhileSolver whileSolver = new WhileSolver();
        whileSolver.factorialOfNumber();

        // Задачи на while. 2. Вывод всех чётных чисел до заданного
        whileSolver.evenNumber();

        // Задачи на while. 3. Обратный отсчёт от введённого числа до 1
        whileSolver.countDownNumber();

        // Задачи на do-while. 1. Запрос положительного числа
        DoWhileSolver doWhileSolver = new DoWhileSolver();
        doWhileSolver.checkPositiveNumber();

        // Задачи на do-while. 2. Проверка пароля
        doWhileSolver.checkValidPassword();

        // Задачи на do-while. 3. Вывод чисел от 1 до 10 с использованием do-while
        doWhileSolver.numbersTo10();

        // Задачи на do-while. 4. Завершение программы по команде "exit"
        doWhileSolver.checkExitCommand();

        // Задачи на do-while. 5. Подсчёт количества цифр в числе
        doWhileSolver.checkNumberDigits();

        // Задачи на break и continue. 1. Сумма чисел до первого отрицательного (использовать break)
        BreakContinueSolver breakContinueSolver = new BreakContinueSolver();
        breakContinueSolver.sumPositiveNumbers();

        // Задачи на break и continue. 2. Пропуск чисел, делящихся на 3 (использовать continue)
        breakContinueSolver.skipNumbers();

        // Задачи на break и continue. 3. Вывод только положительных чисел (использовать continue)
        breakContinueSolver.skipNonPositiveNumbers();

        // Задачи на break и continue. 4. Ввод строк до команды "stop" (использовать break)
        breakContinueSolver.checkStop();

    }
}
