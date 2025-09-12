package practice_5.task_3;

public class Zoo {
    private Animal animal; // по условию задачи у зоопарка одно свойство (поле) - животное

    public void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Животное" + animal + "было добавлено в зоопарк.");
    }

    public void forceMakeSound() {
        this.animal.makeSound();
    }

    public void forceMakeMove() {
        this.animal.makeMove();
    }

    public void removeAnimal() {
        System.out.println("Животное" + animal + "было удалено из зоопарка.");
        this.animal = null;
    }
}
