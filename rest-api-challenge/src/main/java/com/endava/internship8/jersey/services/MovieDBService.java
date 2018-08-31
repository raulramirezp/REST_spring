package com.endava.internship8.jersey.services;

import com.endava.internship8.jersey.domain.Cast;
import com.endava.internship8.jersey.domain.Movie;
import com.endava.internship8.jersey.domain.MovieCast;
import com.endava.internship8.jersey.domain.PopularMovies;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Configuration
@EnableScheduling
public class MovieDBService {

    private List<MovieCast> movieCastsList = new ArrayList<>();
    private PopularMovies movies;

    public PopularMovies getMovies() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return   mapper.readValue(new URL("https://api.themoviedb.org/3/discover/movie?api_key=0c40466fd15a9554a83e25730302cb92&sort_by=popularity.desc"), PopularMovies.class);
    }

    @Scheduled(fixedRate = 2000)
    public void PopularMovies()  throws IOException{

        this.movies = getMovies();
        movieCastsList = this.movies.getResults().stream()
                .sorted(Comparator.comparing(Movie::getPopularity).reversed())
                .limit(20)
                .map(i -> {
                    MovieCast theMovie = null;
                    try {
                        theMovie = getMovieCast(i.getId().toString());
                        theMovie.setTitle(i.getTitle());
                        theMovie.setPopularity(i.getPopularity());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return theMovie;
                }).collect(Collectors.toList());
        System.out.println(movies.getResults());
    }

    public void setMovies(PopularMovies movies) {
        this.movies = movies;
    }

    public List<Movie> getPopularMovies(){

        return this.movies.getResults();
    }

    public MovieCast getMovieCast(String id) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        MovieCast movieCast = mapper.readValue(new URL("https://api.themoviedb.org/3/movie/" + id + "/credits?api_key=0c40466fd15a9554a83e25730302cb92"), MovieCast.class);
        return movieCast;
    }

    public List<MovieCast> getMoviesCast() {
        return movieCastsList;
    }

}
