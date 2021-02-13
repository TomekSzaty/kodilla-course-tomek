package com.kodilla.good.patterns.chalenges.food2door;

import java.time.LocalDateTime;

public interface BoughtService {

    boolean bought(final User user, final LocalDateTime boughtTime, final Order order);
}
