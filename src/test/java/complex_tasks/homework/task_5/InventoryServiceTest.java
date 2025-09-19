package complex_tasks.homework.task_5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {

    @Test
    public void addProductWhenInventoryOpenTest() {
        InventoryService inventoryService = new InventoryService();
        Product apple = new Product("Apple", 30.0, "Fruits");

        inventoryService.addProduct(apple);

        List<Product> products = inventoryService.filterProductsByPrice(50.0);
        assertTrue(products.contains(apple));
    }

    @Test
    public void addProductWhenInventoryClosedTest() {
        InventoryService inventoryService = new InventoryService();
        Product apple = new Product("Apple", 30.0, "Fruits");

        inventoryService.setInventoryOpen(false);

        inventoryService.addProduct(apple);

        List<Product> products = inventoryService.filterProductsByPrice(50.0);
        assertFalse(products.contains(apple));
    }

    @Test
    public void getProductByCategoryTest() throws OutOfStockException {
        InventoryService inventoryService = new InventoryService();
        Product apple = new Product("Apple", 30.0, "Fruits");

        inventoryService.addProduct(apple);

        Product product = inventoryService.getProductByCategory("Fruits");

        assertEquals("Apple", product.getName());
    }

    @Test
    public void getProductFromEmptyCategory() {
        InventoryService inventoryService = new InventoryService();

        assertThrows(OutOfStockException.class, () ->
        {
            inventoryService.getProductByCategory("Dairy products");
        });
    }

    @Test
    public void filterProductByPriceTest() {
        InventoryService inventoryService = new InventoryService();
        Product apple = new Product("Apple", 30.0, "Fruits");
        Product milk = new Product("Milk", 20.0, "Dairy products");

        inventoryService.addProduct(apple);
        inventoryService.addProduct(milk);

        List<Product> products = inventoryService.filterProductsByPrice(28.0);

        assertTrue(products.contains(milk));
        assertFalse(products.contains(apple));

    }


}
