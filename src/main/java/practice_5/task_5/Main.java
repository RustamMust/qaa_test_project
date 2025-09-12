package practice_5.task_5;

public class Main {
    public static void main(String[] args) {
        MainCourse steak = new MainCourse(180);

        RestaurantMenu restaurantMenu = new RestaurantMenu();
        restaurantMenu.addDish(steak);
        restaurantMenu.showCharacteristics();

        Drink moxito = new Drink(250);
        restaurantMenu.addDish(moxito);
        restaurantMenu.showCharacteristics();

    }
}
