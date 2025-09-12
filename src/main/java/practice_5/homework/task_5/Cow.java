package practice_5.homework.task_5;

public class Cow extends FarmAnimal{
    @Override
    void feed() {
        System.out.println("Корова ест траву.");
    }

    @Override
    void care() {
        System.out.println("Выпас коровы.");
    }

    @Override
    void produce() {
        System.out.println("Корова дает молоко.");
    }
}
