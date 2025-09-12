package practice_5.homework.task_2;

public class Main {
    public static void main(String[] args) {
        PetManager petManager = new PetManager();

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        petManager.addPet(cat1);
        petManager.managePet();

        petManager.addPet(dog1);
        petManager.managePet();
    }
}
