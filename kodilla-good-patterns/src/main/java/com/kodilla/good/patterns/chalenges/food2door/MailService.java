package com.kodilla.good.patterns.chalenges.food2door;

public class MailService implements InformationService {
    @Override
    public void inform(User user, Order order) {
        System.out.println("Hello " + user.getUserName() +
                "Your order: " + order.getMenuPosition() +
                "Quantity: " + order.getQuantity() +
                "Total price: " + order.getPrice());
    }
}
