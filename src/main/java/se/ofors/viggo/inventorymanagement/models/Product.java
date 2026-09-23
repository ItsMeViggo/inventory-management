package se.ofors.viggo.inventorymanagement.models;

public class Product {
    private final String name;
    private final int id;
    private double price;
    private int quantity;
    public static int count;

    public Product(final String name, final double price) {
        this.name = name;
        this.price = price;
        count++;
        id = count;
    }

    public void addQuantity(final int amount) {
        quantity += amount;
    }

    public void takeQuantity(final int amount) {
        quantity -= amount;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double isPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // SETTERS
    public void setPrice(final double price) {
        this.price = price;
    }

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "[" + id + "] -> " + name + ", $" + price + " - (" + quantity + ") in stock.";
    }
}
