package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int quantityUsers;
    private int quantityPosts;
    private int quantityComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getQuantityUsers() {
        return quantityUsers;
    }

    public int getQuantityPosts() {
        return quantityPosts;
    }

    public int getQuantityComments() {
        return quantityComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.quantityUsers = statistics.userNames().size();   //uzytkownicy
        this.quantityPosts = statistics.postsCount();         //posty
        this.quantityComments = statistics.commentsCount();   //komentarze

        if (this.quantityUsers == 0) {
            this.averagePostsPerUser = 0;
        } else {
            this.averagePostsPerUser = (double) this.quantityPosts / this.quantityUsers;
        }

        if(this.quantityComments == 0){
            this.averageCommentsPerUser = 0;
        } else {
            this.averageCommentsPerUser = (double) this.quantityComments / this.quantityUsers;
        }

        if (this.quantityComments == 0 || this.quantityPosts == 0) {
            this.averageCommentsPerPost = 0;
        } else {
            this.averageCommentsPerPost = (double) this.quantityComments / this.quantityPosts;
        }
    }

    @Override
    public String toString() {
        return "ForumStatistics{" +
                "quantityUsers=" + quantityUsers +
                ", quantityPosts=" + quantityPosts +
                ", quantityComments=" + quantityComments +
                ", averagePostsPerUser=" + averagePostsPerUser +
                ", averageCommentsPerUser=" + averageCommentsPerUser +
                ", averageCommentsPerPost=" + averageCommentsPerPost +
                '}';
    }

    public void showStatistics() {
        System.out.println("Statystyki forum: '\n'" + "Ilość uzytkowników: " + quantityUsers + '\n' +
                            "Ilość postów: " + quantityPosts + '\n' +
                            "Ilość komentarzy: " + quantityComments + '\n' +
                            "Srednia postów na uzytkownika: " + averagePostsPerUser + '\n' +
                            "Srednia komentarzy na uzytkownika: " + averageCommentsPerUser + '\n' +
                            "Srednia komentarzy na post: " + averageCommentsPerPost + '\n');
    }
}
