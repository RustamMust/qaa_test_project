package practice_4.solvers;

public class ForTaskSolver {
    public static void multiplyTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }

    public static int sumOfAllNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <=n; i++) {
            sum +=i;
        }
        return sum;

    }

    public static boolean checkNumberIsSimple(int number) {
        boolean isSimple = true;

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;

            }
        }
        return isSimple;
    }

    public static void printAllSimpleNumbersBefore100() {
        for (int i = 2; i <= 100; i++){
            if (checkNumberIsSimple(i)) {
                System.out.println(i);
            }
        }
    }
}
