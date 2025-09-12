package practice_2.homework;

public class Product {
    String name;
    int price;

    Product (String someName, int somePrice) {
        this.name = someName;
        this.price = somePrice;
    }

    String getName () {
        return this.name;
    }

    int getPrice () {
        return this.price;
    }

    void setPrice (int newPrice) {
        this.price = newPrice;
    }

    void applyDiscount(int discount) {
        this.price = this.price - discount;
    }

    void printInfo() {
        System.out.println("Name: " + this.name + ", " + "price: " + this.price + ".");
    }
}
