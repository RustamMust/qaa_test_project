package practice_5.homework.task_5;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        Cow cow1 = new Cow();
        Chicken chicken1 = new Chicken();

        farm.addFarmAnimal(cow1);
        farm.serviceAnimal();

        farm.addFarmAnimal(chicken1);
        farm.serviceAnimal();
    }
}
