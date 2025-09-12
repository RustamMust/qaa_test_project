package practice_5.task_4;

public class PetManager {
    private Pet pet;


    public void addPet(Pet pet) {
        this.pet = pet;
        System.out.println("Добавили животное.");
    }

    public void feedPet() {
        this.pet.eat();
        System.out.println("Животное поело.");
    }

    public void forcePetToPlay() {
        if (this.pet instanceof Playable) {
            Playable playablePet = (Playable) this.pet;
            playablePet.play();
        } else {
            System.out.println("Ошибка. Животное не играет.");
        }
    }

    public void forcePetToWalk() {
        if (this.pet instanceof Walkable) {
            Walkable walkablePet = (Walkable) this.pet;
            walkablePet.walk();
        } else {
            System.out.println("Ошибка. Животное не гуляет.");
        }
    }

}
