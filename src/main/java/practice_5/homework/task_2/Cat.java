package practice_5.homework.task_2;

public class Cat extends Pet{
    @Override
    void feed() {
        System.out.println("Кошка ест влажный корм.");
    }

    @Override
    void interact() {
        System.out.println("Кошка играет.");
    }
}
