package practice_3.homework;

public class MathConstants {
    final static double PI = 3.14159;
    final static double E = 2.71828;

    static void calculateCircleArea(double r) {
        double circleArea = PI * r * r;
        System.out.println("CircleArea: " + circleArea);
    }

    static void calculateCircumference(double r) {
        double circumference = 2 * PI * r;
        System.out.println("Circumference: " + circumference);
    }
}
