package practice_5.task_4;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        PetManager petManager = new PetManager();
        petManager.addPet(dog1);
        petManager.feedPet();
        petManager.forcePetToPlay();
        petManager.forcePetToWalk();

        Cat cat1 = new Cat();
        petManager.addPet(cat1);
        petManager.feedPet();
        petManager.forcePetToPlay();
        petManager.forcePetToWalk();
    }
}
