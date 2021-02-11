package com.kodilla.good.patterns.chalenges;

import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore.getMovies());
        String challengeMovieStore = movieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(challengeMovieStore);
    }
}
