package com.kodilla.good.patterns.chalenges;

public class MailService implements InformationService{


    @Override
    public void inform(User user) {
        System.out.println("Congratulation, you just bought an  brand new item!");
    }
}
