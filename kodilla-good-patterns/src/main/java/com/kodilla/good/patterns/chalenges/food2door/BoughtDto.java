package com.kodilla.good.patterns.chalenges.food2door;

public class BoughtDto {
    private User user;
    private boolean isBought;

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }

    public BoughtDto(User user, boolean isBought) {
        this.user = user;
        this.isBought = isBought;


    }
}
