
package com.endava.internship8.jersey.controllers;
import java.io.IOException;

import com.endava.internship8.jersey.domain.Cast;
import com.endava.internship8.jersey.domain.Movie;
import com.endava.internship8.jersey.domain.MovieCast;
import com.endava.internship8.jersey.domain.MovieRank;
import com.endava.internship8.jersey.services.DatabaseService;
import com.endava.internship8.jersey.services.MovieDBService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class MainCastController {
    private DatabaseService databaseService = new DatabaseService();
    private MovieDBService movieDBService = new MovieDBService();
/*
    public MainCastController(DatabaseService databaseService, MovieDBService movieDBService) {
        this.databaseService = databaseService;
        this.movieDBService = movieDBService;
    }*/

    @GetMapping("/main-cast")
    @ResponseBody
    public List<MovieCast> getMovieCast() throws IOException {
        return movieDBService.getMoviesCast();
    }

    @GetMapping("/popular-movies")
    @ResponseBody
    public List<Movie> getMoviesList() throws IOException {
        System.out.println(  movieDBService.getPopularMovies());
        return  movieDBService.getPopularMovies();

    }

    public List<MovieCast> getMovieCastList() throws IOException {
        return  movieDBService.getMoviesCast();
    }

    public int storeMoviesCast(List<MovieCast> moviesCast) {
        return databaseService.storeMoviesCast(moviesCast);
    }

    public int storeMoviesRank(List<Movie> movies) {
        return databaseService.storeTodaysPopularMovies(movies);
    }
}