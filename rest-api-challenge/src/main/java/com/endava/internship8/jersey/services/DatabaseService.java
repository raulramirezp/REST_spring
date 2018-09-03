package com.endava.internship8.jersey.services;

import com.endava.internship8.jersey.domain.Cast;
import com.endava.internship8.jersey.domain.Movie;
import com.endava.internship8.jersey.domain.MovieCast;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

public class DatabaseService{

    private RestTemplate restTemplate = new RestTemplate();

    private String urlMovies = new String("http://localhost:3000/api/movies");
    private String urlCast= new String("http://localhost:3000/api/main_casts");

    public DatabaseService() {
    }

    public int storeTodaysPopularMovies(List<Movie> movies) {
        System.out.println("From  storeTodaysPopularMovies in DatabaseService ");
        System.out.println(movies);
/*        restTemplate.postForObject(
                urlMovies,
                movies,
                ResponseEntity.class);*/
        //HttpEntity<Movie> request = new HttpEntity<>();
        for( Movie movie : movies)
            restTemplate.postForObject(urlMovies, movie, Movie.class);

        return 0;
    }

    public int storeMoviesCast(List<MovieCast> movieCastList) {
        System.out.println("From  storeMoviesCast in DatabaseService ");
        for (MovieCast movieCast : movieCastList ) {
            System.out.println(movieCast.getCast());
            for(Cast actor: movieCast.getCast())
                restTemplate.postForObject(urlCast, actor, Cast.class);
        }

        return 0;
    }
}
