package com.kodilla.patterns.strategy.social;

public class Zgeneration extends User {
    public Zgeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
