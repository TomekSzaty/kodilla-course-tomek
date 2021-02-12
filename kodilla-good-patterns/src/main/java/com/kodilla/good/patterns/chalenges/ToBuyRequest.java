package com.kodilla.good.patterns.chalenges;

import java.time.LocalDateTime;

public class ToBuyRequest {

    private User user;
    private LocalDateTime boughtTime;

    public ToBuyRequest(User user, LocalDateTime boughtTime) {
        this.user = user;
        this.boughtTime = boughtTime;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getBoughtTime() {
        return boughtTime;
    }
}
