package com.endava.internship8.jersey.domain;

public class MovieRank extends MovieDecorator<Integer> {

    public MovieRank() {
        super();
    }

    public MovieRank(String s, Integer integer) {
        super(s, integer);
    }
    public MovieRank(String s, Integer integer, Double popularity) {
        super(s, integer, popularity);
    }
}
