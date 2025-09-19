package complex_tasks.homework.task_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryService {
    private boolean isInventoryOpen = true;
    private Map<String, List<Product>> inventory = new HashMap<>();

    public void setInventoryOpen(boolean isOpen) {
        this.isInventoryOpen = isOpen;
    }

    public void addProduct(Product product) {
        if (!isInventoryOpen) {
            System.out.println("Склад закрыт.");
            return;
        }

        inventory.computeIfAbsent(product.getCategory(), k -> new ArrayList<>()).add(product);
    }

    public Product getProductByCategory(String category) throws OutOfStockException {
        List<Product> products = inventory.get(category);

        if (products == null || products.isEmpty()) {
            throw new OutOfStockException("Нет товаров в выбранной категории.");
        }

        return products.removeFirst();
    }

    public List<Product> filterProductsByPrice(double price) {
        return inventory.values().stream()
                .flatMap(List::stream)
                .filter(product -> product.getPrice() <= price)
                .toList();
    }

}
