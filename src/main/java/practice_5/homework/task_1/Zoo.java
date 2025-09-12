package practice_5.homework.task_1;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Животное добавлено.");
    }

    public void showAnimalBehaviour() {
        this.animal.makeSound();
        this.animal.move();
    }
}
