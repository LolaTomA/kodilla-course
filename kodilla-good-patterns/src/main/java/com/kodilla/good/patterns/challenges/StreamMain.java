package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        String titlesList;
        MovieStore polishTitles = new MovieStore();

        titlesList = polishTitles.getMovies().entrySet().stream()
                    .flatMap(list -> list.getValue().stream())
                    .collect(Collectors.joining("! ", "", "!"));

        System.out.println(titlesList);
    }
}