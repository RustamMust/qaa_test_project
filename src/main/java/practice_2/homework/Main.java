package practice_2.homework;

public class Main {
    public static void main(String[] args) {
        // Class Car
        Car bmw1 = new Car("BMW1", 2005);
        bmw1.print();

        bmw1.setYear(2006);
        bmw1.print();

        // Class Rectangle
        Rectangle rectangle1 = new Rectangle(10, 10);
        rectangle1.calculateArea();

        rectangle1.setWidth(5);
        rectangle1.calculateArea();

        // Class Book
        Book book1 = new Book("Great book", "Alex");
        book1.printInfo();

        book1.setAuthor("Rustam");
        book1.printInfo();

        // Class BankAccount
        BankAccount bankAccount1 = new BankAccount("Rustam", 1000);
        bankAccount1.printBalance();

        bankAccount1.deposit(1000);
        bankAccount1.printBalance();

        bankAccount1.withdraw(500);
        bankAccount1.printBalance();

        // Class Point
        Point point1 = new Point(100, 200);
        point1.print();

        point1.setX(150);
        point1.print();

        // Class StudentGroup
        StudentGroup studentGroup1 = new StudentGroup("RustamGroup", 10);
        studentGroup1.printInfo();

        studentGroup1.setStudentCount(15);
        studentGroup1.printInfo();

        // Class Circle
        Circle circle1 = new Circle(5);
        circle1.calculateArea();
        circle1.calculateCircumference();

        circle1.setRadius(6);
        circle1.calculateArea();
        circle1.calculateCircumference();

        // Class Teacher
        Teacher teacher1 = new Teacher("Frodo", "Math");
        teacher1.printInfo();

        teacher1.setSubject("English");
        teacher1.printInfo();

        // Class Product
        Product product1 = new Product("Apple", 50);
        product1.printInfo();

        product1.setPrice(100);
        product1.printInfo();

        product1.applyDiscount(10);
        product1.printInfo();

        // Class Laptop
        Laptop laptop1 = new Laptop("Apple", 5000);
        laptop1.printInfo();

        laptop1.setPrice(10000);
        laptop1.printInfo();

    }
}
