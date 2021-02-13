package com.kodilla.good.patterns.chalenges.food2door;

import java.time.LocalDateTime;

public class BoughtRequest {
    private User user;
    private LocalDateTime boughtTime;
    private Order order;

    public BoughtRequest(User user, LocalDateTime boughtTime, Order order) {
        this.user = user;
        this.boughtTime = boughtTime;
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getBoughtTime() {
        return boughtTime;
    }

    public Order getOrder() {
        return order;
    }
}
