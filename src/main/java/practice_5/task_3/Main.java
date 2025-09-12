package practice_5.task_3;

public class Main {
    public static void main(String[] args) {
        Zoo zooOfTexas = new Zoo();

        Bird colibri = new Bird();

        zooOfTexas.addAnimal(colibri);
        zooOfTexas.forceMakeSound();
        zooOfTexas.forceMakeMove();

        zooOfTexas.removeAnimal();

        Elephant elephant = new Elephant();
        zooOfTexas.addAnimal(elephant);
        zooOfTexas.forceMakeSound();
        zooOfTexas.forceMakeMove();


    }
}
