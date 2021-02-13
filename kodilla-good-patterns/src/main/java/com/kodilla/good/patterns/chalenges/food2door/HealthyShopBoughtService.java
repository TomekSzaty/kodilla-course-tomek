package com.kodilla.good.patterns.chalenges.food2door;

import java.time.LocalDateTime;

public class HealthyShopBoughtService implements BoughtService {
    @Override
    public boolean bought(User user, LocalDateTime boughtTime, Order order) {
        System.out.println("Order: " + order.getMenuPosition() +
                "Price: " + order.getPrice() +
                "Quantity: " + order.getQuantity() +
                "Client: " + user.getUserNick() +
                "Name: " + user.getUserName() +
                "LastName: " + user.getUserLastName() +
                "OrderTime: " + boughtTime.toString());
        return true;
    }
}
