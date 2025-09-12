package practice_2;

public class Student {
    int age;
    String name;

    // Конструктор
    Student(int someAge, String someName){
        this.age = someAge;
        this.name = someName;
    }

    // Геттер для поля age
    int getAge() {
        return this.age;
    }

    // Геттер для поля name
    String getName () {
        return this.name;
    }

    // Сеттер для поля age
    void setAge(int newAge) {
        this.age = newAge;
    }

    // Сеттер для поля name
    void setName (String newName) {
        this.name = newName;
    }

    void printStudentInfo() {
        System.out.println("Student age: " + this.age + "," + " student name: " + this.name + ".");
    }

}
