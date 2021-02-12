package com.kodilla.good.patterns.chalenges;

import java.time.LocalDateTime;

public class ItemBoughtService implements ToBuyService{
    @Override
    public boolean bought(User user, LocalDateTime boughtTime) {
        System.out.println("Item bought: " + user.getNickName() +
                user.getUserName() +
                user.getUserLastName()+ "\nDate: " +
                boughtTime.toString());

        return true;
    }
}
