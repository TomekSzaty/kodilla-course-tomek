package com.kodilla.good.patterns.chalenges.food2door;


public class App {
    public static void main(String[] args) {

        BoughtRequestRetriever boughtRequestRetrieverExtraFood = new BoughtRequestRetriever();
        BoughtRequest boughtRequest = boughtRequestRetrieverExtraFood.retrieveExtraFood();

        ProductOrderService orderServiceExtraFood = new ProductOrderService(new MailService(),
                new ExtraFoodShopBoughtService(),
                new ExtraFoodBoughtRepository());
        orderServiceExtraFood.process(boughtRequest);


        BoughtRequestRetriever boughtRequestRetrieverHealthyShop = new BoughtRequestRetriever();
        BoughtRequest boughtRequestHealthyShop = boughtRequestRetrieverHealthyShop.retrieveHealthyShop();

        ProductOrderService orderServiceHealthyShop = new ProductOrderService(new MailService(),
                new HealthyShopBoughtService(),
                new HealthyShopBoughtRepository());
        orderServiceHealthyShop.process(boughtRequestHealthyShop);


        BoughtRequestRetriever boughtRequestRetrieverGlutenFreeShop = new BoughtRequestRetriever();
        BoughtRequest boughtRequestGlutenFreeShop = boughtRequestRetrieverGlutenFreeShop.retrieveGlutenFreeShop();

        ProductOrderService orderServiceGlutenFreeShop = new ProductOrderService(new MailService(),
                new GlutenFreeBoughtService(),
                new GlutenFreeShopBoughtRepository());
        orderServiceGlutenFreeShop.process(boughtRequestGlutenFreeShop);
    }
}
