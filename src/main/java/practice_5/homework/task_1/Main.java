package practice_5.homework.task_1;

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Bird();

        Zoo someZoo = new Zoo();

        someZoo.setAnimal(bird1);
        someZoo.showAnimalBehaviour();

        Elephant elephant1 = new Elephant();
        someZoo.setAnimal(elephant1);
        someZoo.showAnimalBehaviour();

    }
}
