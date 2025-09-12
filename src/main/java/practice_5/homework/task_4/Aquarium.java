package practice_5.homework.task_4;

public class Aquarium {
    private SeaCreature seaCreature;

    public void addSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
        System.out.println("Морское существо добавлено в аквариум.");
    }

    public void showMovement() {
        this.seaCreature.move();
    }
}
