package com.kodilla.good.patterns.chalenges;

import java.time.LocalDateTime;

public class ItemBoughtRepository implements ToBuyRepository{
    @Override
    public boolean createBought(User user, LocalDateTime boughtTime) {
        return false;
    }
}
