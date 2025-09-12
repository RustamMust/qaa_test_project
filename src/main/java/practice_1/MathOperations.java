package practice_1;

public class MathOperations {
    public static void main(String[] args) {
        int sum1 = add(1,2);
        System.out.println("Sum of two numbers: " + sum1);

        int subtract1 = subtract(5, 2);
        System.out.println("Subtract of two numbers: " + subtract1);

        int multiply1 = multiply(5, 2);
        System.out.println("Multiply of two numbers: " + multiply1);

        double divide1 = divide(5, 2);
        System.out.println("Divide of two numbers: " + divide1);

        int findmax = findMax(5, 2);
        System.out.println("Max of two numbers: " + findmax);

        int difference1 = difference(5, 2);
        System.out.println("Difference of two numbers: " + difference1);

        int square1 = squareArea(5);
        System.out.println("Square: " + square1);

        int squareperimeter1 = squarePerimeter(5);
        System.out.println("Square perimeter: " + squareperimeter1);

        double seconds1 = convertSecondsToMinutes(120);
        System.out.println("Seconds to minutes: " + seconds1);

        double speed1 = averageSpeed(600, 10);
        System.out.println("Average speed: " + speed1);

        double findhypotenuse1 = findHypotenuse(5, 2);
        System.out.println("Hypotenuse: " + findhypotenuse1);

        double findhypotenuse2 = findHypotenuse(4, 3);
        System.out.println("Hypotenuse2: " + findhypotenuse2);

        double circum1 = circleCircumference(5);
        System.out.println("Circumference: " + circum1);

        double circum2 = circleCircumference(6);
        System.out.println("Circumference2: " + circum2);

        double percent1 = calculatePercentage(100, 5);
        System.out.println("Percentage: " + percent1);

        double farent1 = celsiusToFahrenheit(100);
        System.out.println("ToFahrenheit: " + farent1);

        double celsius1 = fahrenheitToCelsius(100);
        System.out.println("ToCelsius: " + celsius1);


    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    public static double averageSpeed(double distance, double time) {
        if (time == 0) {
            throw new IllegalArgumentException("Time should be not 0.");
        }
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Arguments should be more then 0.");
        }
        return Math.sqrt(a*a + b*b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        if (total == 0) {
            throw new IllegalArgumentException("Total should be not 0.");
        }
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;

    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;

    }
}


