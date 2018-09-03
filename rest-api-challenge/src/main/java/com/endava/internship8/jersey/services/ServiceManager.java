package com.endava.internship8.jersey.services;

import com.endava.internship8.jersey.domain.MovieCast;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@Configuration
@EnableScheduling
public class ServiceManager {

    private DatabaseService databaseService = new DatabaseService();
    private MovieDBService movieDBService = new MovieDBService();

    @Scheduled(fixedRate = 50000)
    private void getAndPutNewData() throws IOException {
        List<MovieCast> movieCastList = movieDBService.MoviesCasts();

        databaseService.storeTodaysPopularMovies( movieDBService.getPopularMovies().getResults());
        databaseService.storeMoviesCast(movieCastList);

    }



}
