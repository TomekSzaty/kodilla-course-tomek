package com.kodilla.good.patterns.chalenges.food2door;

import java.time.LocalDateTime;

public class HealthyShop {
    private String menuPosition;
    private int price;
    private LocalDateTime boughtTime;

    public HealthyShop(String menuPosition, int price, LocalDateTime boughtTime) {
        this.menuPosition = menuPosition;
        this.price = price;
        this.boughtTime = boughtTime;
    }

    public String getMenuPosition() {
        return menuPosition;
    }

    public int getPrice() {
        return price;
    }

    public LocalDateTime getBoughtTime() {
        return boughtTime;
    }
}
