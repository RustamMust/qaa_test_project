package practice_5.homework.task_3;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        HotDish hotDish1 = new HotDish(80);
        Drink drink1 = new Drink(500);

        menu.addDish(hotDish1);
        menu.printMenu();

        menu.addDish(drink1);
        menu.printMenu();
    }
}
