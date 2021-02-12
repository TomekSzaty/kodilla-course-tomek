package com.kodilla.good.patterns.chalenges;

import java.time.LocalDateTime;

public class BoughtRequestRetriever {

    public ToBuyRequest receive() {
        User user = new User("JD ", "John ", "Doe ");
        LocalDateTime boughtTime = LocalDateTime.of(2020,12,10,10,15);

        return new ToBuyRequest(user, boughtTime);
    }
}
