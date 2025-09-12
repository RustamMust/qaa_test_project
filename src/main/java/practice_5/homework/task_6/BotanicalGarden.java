package practice_5.homework.task_6;

public class BotanicalGarden {
    private Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
        System.out.println("Растение добавлено в ботанический сад.");
    }

    public void maintainPlant() {
        this.plant.care();
    }
}
