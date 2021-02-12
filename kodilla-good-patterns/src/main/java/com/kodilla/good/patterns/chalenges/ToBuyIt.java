package com.kodilla.good.patterns.chalenges;

public class ToBuyIt {
    private User user;
    private boolean isBought;

    public ToBuyIt(User user, boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }
}
