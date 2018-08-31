package com.endava.internship8.jersey.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(value = { "page","total_results", "total_pages" } )

public class PopularMovies {
    private List<Movie> results = new ArrayList<>(20);

    public PopularMovies(){}

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Action{");
        for (Movie movie : results
        ) {
            sb.append(movie.toString());
        }
        sb.append('}');
        return sb.toString();
    }
}


