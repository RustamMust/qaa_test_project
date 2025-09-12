package practice_2.homework;

public class Circle {
    int radius;

    Circle (int someRadius) {
        this.radius = someRadius;
    }

    int getRadius () {
        return this.radius;
    }

    void setRadius (int newRadius) {
        this.radius = newRadius;
    }

    void calculateArea() {
        double area = Math.PI * this.radius * this.radius;
        System.out.println("Area: " + area);

    }

    void calculateCircumference() {
        double circumference = 2 * Math.PI * this.radius;
        System.out.println("Circumference: " + circumference);

    }
}
