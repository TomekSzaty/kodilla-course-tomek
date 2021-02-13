package com.kodilla.good.patterns.chalenges.food2door;

import java.time.LocalDateTime;

public class BoughtRequestRetriever {

    public BoughtRequest retrieveExtraFood() {
        System.out.println("ExtraFoodShop");

        User user = new User("JD", "John", "Doe");
        LocalDateTime boughtTime = LocalDateTime.now();
        Order order = new Order("Shrimps ", 99, 1);

        return new BoughtRequest(user, boughtTime, order);
    }

    public BoughtRequest retrieveHealthyShop() {
        System.out.println("HealthyShop");

        User user = new User("MJ", "Mike", "Jackson");
        LocalDateTime boughtTime = LocalDateTime.now();
        Order order = new Order("Vege ", 49, 1);

        return new BoughtRequest(user, boughtTime, order);
    }

    public BoughtRequest retrieveGlutenFreeShop() {
        System.out.println("GlutenFreeShop");

        User user = new User("JJ", "Janet", "Jackson");
        LocalDateTime boughtTime = LocalDateTime.now();
        Order order = new Order("SoyBurger ", 29, 1);

        return new BoughtRequest(user, boughtTime, order);
    }
}
