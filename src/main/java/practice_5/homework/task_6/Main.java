package practice_5.homework.task_6;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();

        Orchid orchid1 = new Orchid();
        Cactus cactus1 = new Cactus();

        botanicalGarden.addPlant(orchid1);
        botanicalGarden.maintainPlant();

        botanicalGarden.addPlant(cactus1);
        botanicalGarden.maintainPlant();

    }
}
