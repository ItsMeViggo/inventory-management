package se.ofors.viggo.inventorymanagement;

import se.ofors.viggo.inventorymanagement.models.Product;
import se.ofors.viggo.inventorymanagement.service.Inventory;

import java.util.List;

public class Main {
    static void main() {
        Inventory inventory = new Inventory();
        List<Product> productList = inventory.getProductList();

        inventory.addProduct("Kaffe", 2.49);
        inventory.addProduct("Chips", 3.99);
        inventory.addProduct("Läsk", 1.50);
        inventory.addProduct("Äpple", 0.25);
        inventory.addProduct("Nötfärs", 8.99);

        productList.getFirst().addQuantity(20);
        productList.getFirst().takeQuantity(2);

        for (Product product : productList) {
            IO.println(product.getName() + " " + product.getId());
        }

        IO.println(inventory.searchForProduct("Kaffe"));
    }
}
