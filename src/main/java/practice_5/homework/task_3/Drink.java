package practice_5.homework.task_3;

public class Drink extends Dish{
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    void getDescription() {
        System.out.println("Объем блюда " + volume);
    }
}
