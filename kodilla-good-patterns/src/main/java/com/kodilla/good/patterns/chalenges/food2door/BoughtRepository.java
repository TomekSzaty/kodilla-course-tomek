package com.kodilla.good.patterns.chalenges.food2door;



import java.time.LocalDateTime;

public interface BoughtRepository {
    boolean createBought(final User user, final LocalDateTime boughtTime);
}
