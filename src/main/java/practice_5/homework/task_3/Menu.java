package practice_5.homework.task_3;

public class Menu {
    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
        System.out.println("Блюдо добавлено.");
    }

    public void printMenu() {
        this.dish.getDescription();
    }
}
