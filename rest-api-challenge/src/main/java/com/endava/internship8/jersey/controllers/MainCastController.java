
package com.endava.internship8.jersey.controllers;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainCastController {

/*    private DatabaseService databaseService;
    private MovieDBService movieDBService = new MovieDBService();

*//*    @GetMapping("/main-cast")
    @ResponseBody
    public List<MovieCast> getMovieCast() throws IOException {

        return movieDBService.getMoviesCast();
    }

    @GetMapping("/popular-movies")
    @ResponseBody
    public List<Movie> getMoviesList() throws IOException {
        System.out.println(  movieDBService.getPopularMovies());
        return  movieDBService.getPopularMovies();

    }*//*

    public List<MovieCast> getMovieCastList() throws IOException {
        return  movieDBService.getMoviesCast();
    }

    public int storeMoviesCast(List<MovieCast> moviesCast) {
        return databaseService.storeMoviesCast(moviesCast);
    }

    public int storeMoviesRank(List<Movie> movies) {
        return databaseService.storeTodaysPopularMovies(movies);
    }*/
}