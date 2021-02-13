package com.kodilla.good.patterns.chalenges.food2door;

import java.time.LocalDateTime;

public class GlutenFreeShopBoughtRepository implements BoughtRepository{

    @Override
    public boolean createBought(User user, LocalDateTime boughtTime) {
        return false;
    }
}
