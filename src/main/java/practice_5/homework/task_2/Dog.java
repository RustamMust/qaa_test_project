package practice_5.homework.task_2;

public class Dog extends Pet {
    @Override
    void feed() {
        System.out.println("Собака ест сухой корм");
    }

    @Override
    void interact() {
        System.out.println("Собака гуляет");
    }
}
