package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final String userName;
    private final int userIdentifier;
    private final char userSex;
    private final LocalDate dateOfBirth;
    private final int quantityPosts;

    public ForumUser(String userName, int userIdentifier, char userSex, int yearOfBirth, int monthOfBirth,
                     int dayOfBirth, int quantityPosts) {
        this.userName = userName;
        this.userIdentifier = userIdentifier;
        this.userSex = userSex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.quantityPosts = quantityPosts;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserIdentifier() {
        return userIdentifier;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getQuantityPosts() {
        return quantityPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", userIdentifier=" + userIdentifier +
                ", userSex=" + userSex +
                ", dateOfBirth=" + dateOfBirth +
                ", quantityPosts=" + quantityPosts +
                '}';
    }
}
