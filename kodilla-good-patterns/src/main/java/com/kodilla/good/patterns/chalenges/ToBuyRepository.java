package com.kodilla.good.patterns.chalenges;

import java.time.LocalDateTime;

public interface ToBuyRepository {

    boolean createBought(final User user, final LocalDateTime boughtTime);
}
