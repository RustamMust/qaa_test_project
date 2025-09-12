package practice_5.homework.task_4;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Starfish starfish1 = new Starfish();
        Shark shark1 = new Shark();

        aquarium.addSeaCreature(starfish1);
        aquarium.showMovement();

        aquarium.addSeaCreature(shark1);
        aquarium.showMovement();
    }
}
