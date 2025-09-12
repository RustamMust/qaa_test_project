package practice_2.homework;

public class Rectangle {
    int width;
    int height;

    Rectangle(int someWidth, int someHeight) {
        this.width = someWidth;
        this.height = someHeight;
    }

    int getWidth() {
        return this.width;
    }

    int getHeight () {
        return this.height;
    }

    void setWidth(int newWidth) {
        this.width = newWidth;
    }

    void calculateArea() {
        System.out.println("Area: " + this.width * this.height + ".");
    }

}
