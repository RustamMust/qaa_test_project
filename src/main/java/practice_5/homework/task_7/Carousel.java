package practice_5.homework.task_7;

public class Carousel extends Attraction{
    @Override
    void info() {
        System.out.println("Спокойный аттракцион.");
    }

    @Override
    void maintain() {
        System.out.println("Нужно тех обслуживание.");
    }
}
