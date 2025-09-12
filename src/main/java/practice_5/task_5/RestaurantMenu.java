package practice_5.task_5;

public class RestaurantMenu {
    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
    }

    public void showCharacteristics() {
        this.dish.showCharacteristics();
    }
}
