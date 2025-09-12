package practice_4.solvers;

public class IfElseTaskSolver {
    /**
     * Метод проверяет четное число или нет
     * @param number число, которое проверяем
     * @return строка "Четное" или "Нечетное"
     */
    public String checkParity(int number) {
        String parity = "Нечетное";

        if (number % 2 == 0) {
            parity = "Четное";
        }
        return parity;
    }

    public String checkAge(int age) {
        String ageDescription = "";

        if (age < 18) {
            ageDescription = "Несовершеннолетний";
        }
        if (age >= 18 && age <= 60) {
            ageDescription = "Взрослый";
        }
        if (age > 60) {
            ageDescription = "Пожилой";
        }
        return ageDescription;
    }

    public int checkMax(int a, int b, int c) {
        // Алгоритм - вначале проверяем два числа, потом сравниваем большее число с третьим
        int maxAB = b;

        if (a > b) {
            maxAB = a;
        }

        int max = maxAB;

        if (c > maxAB) {
            max = c;
        }

        return max;
    }

}
