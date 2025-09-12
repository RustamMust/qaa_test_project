package practice_5.homework.task_2;

public class PetManager {
    private Pet pet;

    public void addPet(Pet pet) {
        this.pet = pet;
        System.out.println("Животное добавлено.");
    }

    public void managePet(){
        this.pet.feed();
        this.pet.interact();
    }
}
