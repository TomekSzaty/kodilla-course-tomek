package com.kodilla.good.patterns.chalenges.food2door;

public class Order {
    private String menuPosition;
    private int price;
    private int quantity;

    public Order(String menuPosition, int price, int quantity) {
        this.menuPosition = menuPosition;
        this.price = price;
        this.quantity = quantity;
    }

    public String getMenuPosition() {
        return menuPosition;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
