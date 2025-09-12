package practice_5.homework.task_3;

public class HotDish extends Dish {
    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    @Override
    void getDescription() {
        System.out.println("Температура блюда " + temperature);
    }
}
