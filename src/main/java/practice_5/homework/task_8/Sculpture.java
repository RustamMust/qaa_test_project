package practice_5.homework.task_8;

public class Sculpture extends Exhibit {
    @Override
    void describe() {
        System.out.println("Скульптурный объект.");
    }

    @Override
    void preserve() {
        System.out.println("Реставрация.");
    }
}
