package practice_5.homework.task_5;

public class Chicken extends FarmAnimal{
    @Override
    void feed() {
        System.out.println("Курица ест зерно.");
    }

    @Override
    void care() {
        System.out.println("Курица нуждается в кормушке.");
    }

    @Override
    void produce() {
        System.out.println("Курица несет яйца.");
    }
}
