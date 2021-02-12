package com.kodilla.good.patterns.chalenges;

import java.time.LocalDateTime;

public interface ToBuyService {

    boolean bought(User user, LocalDateTime boughtTime);
}
