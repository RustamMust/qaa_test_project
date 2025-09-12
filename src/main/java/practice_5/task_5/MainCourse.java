package practice_5.task_5;

public class MainCourse extends Dish{
    private int temperature;

    public MainCourse(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }


    @Override
    void showCharacteristics() {
        System.out.println("Температура горячего блюда " + this.temperature);
    }
}
