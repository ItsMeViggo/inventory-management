package se.ofors.viggo.inventorymanagement.service;

import se.ofors.viggo.inventorymanagement.models.Product;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Product> productList = new ArrayList<>();

    public void addProduct(final String name, final double price) {
        Product product = new Product(name, price);
        productList.add(product);
    }

    public void removeProduct(final int index) {
        productList.remove(index);
    }

    public String searchForProduct(final String name) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product.toString();
            }
        }
        return name + " was not found.";
    }

    public List<Product> getProductList() {
        return productList;
    }

}
