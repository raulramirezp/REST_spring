package com.endava.internship8.jersey.services;

public class ControllerTestUtils {
/*
    public static List<Movie> getTypeMovieList(int listSize, String movieType) {
        return MovieFactory.createMovieList(listSize, movieType);
    }

    public static List<Movie> getPartialMovieList() {
        return MovieFactory.createMovieList(6, "Movie");
    }

    public static List<Movie> getCompleteMovieList() {
        return MovieFactory.createMovieList(20, "Movie");
    }


    static class MovieFactory {

        private static Map<String, Function2<String, Integer, Movie>> map = HashMap.of("Movie", Movie::new,
                "MovieCast", MovieCast::new,
                "MovieRank", MovieRank::new);


        public static List<Movie> createMovieList(int listSize, String movieType) {
            return List.range(0, listSize).map(i -> getMovie(movieType, i));
        }

        public static List<Movie> insertNullsInMovieList(List<Movie> movies) {
            return movies.map(i -> Math.random() < 0.4 ? null : i);
        }

        public static Movie getMovie(String movieType, int id) {
            return map.get(movieType).get().apply("Juan", id);
        }
    }*/
}
