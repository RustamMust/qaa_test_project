package practice_5.homework.task_5;

public class Farm {
    private FarmAnimal farmAnimal;

    public void addFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
        System.out.println("Домашнее животное добавлено.");
    }

    public void serviceAnimal() {
        this.farmAnimal.care();
        this.farmAnimal.feed();
        this.farmAnimal.produce();
    }


}
