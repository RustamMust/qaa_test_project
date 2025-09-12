package practice_7.restaurant_manager;

public class Main {
    public static void main(String[] args) {
        RestaurantManager restaurantManager = new RestaurantManager();

        restaurantManager.addNewOrder("Картошка фри");
        restaurantManager.printOrders();

        restaurantManager.addNewOrder("Спагетти");
        restaurantManager.printOrders();

        restaurantManager.getNextOrderForProcess();
        restaurantManager.printOrders();

        restaurantManager.addNewOrder("Картошка фри");
        restaurantManager.addNewOrder("Маргарита");
        restaurantManager.printOrders();

        restaurantManager.deleteOrder("Спагетти");
        restaurantManager.printOrders();
    }
}
