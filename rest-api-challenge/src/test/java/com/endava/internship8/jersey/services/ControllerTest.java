package com.endava.internship8.jersey.services;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

/*
import static com.endava.internship8.jersey.services.ControllerTestUtils.MovieFactory.insertNullsInMovieList;
import static com.endava.internship8.jersey.services.ControllerTestUtils.getTypeMovieList;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertEquals;

*/

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {

 /*   @Mock
    MovieDBService movieService;

    @Mock
    DatabaseService databaseService;

    @InjectMocks
    MainCastController controller;

*//*
    @Test
    public void happyPathReceiveMoviesList() {
        List<Movie> completeMovies = ControllerTestUtils.getCompleteMovieList();

        when(movieService.getPopularMovies()).thenReturn(completeMovies.toJavaList());
        assertEquals("The happy path failed. The size of output is not complete (20)",
                completeMovies.length(), controller.getMoviesList().size());

    }
*//*

    @Test
    public void receiveMoviesListWithNulls() throws IOException {
        List<Movie> completeMovies = ControllerTestUtils.getCompleteMovieList();
        List<Movie> completeMoviesWithNulls = insertNullsInMovieList(completeMovies);

        when(movieService.getPopularMovies()).thenReturn(completeMoviesWithNulls.toJavaList());
        assertEquals("The happy path failed. The size of output is not complete (20)",
                completeMoviesWithNulls.filter(Objects::nonNull).length(), controller.getMoviesList().size());

    }

    @Test
    public void happyPathReceiveMoviesCast() throws IOException {
        List<MovieCast> completeMoviesCast = getTypeMovieList(20, "MovieCast")
                .map(i -> {
                    MovieCast a = (MovieCast) i;
                    a.setData(Arrays.asList("one", "two", "three"));
                    return a;
                });


        when(movieService.getMoviesCast()).thenReturn(completeMoviesCast.toJavaList());
        assertEquals("The happy path failed. A list of movies with non-empty casts was recognized as having " +
                        "at least an empty cast",
                0, (int) controller.getMovieCastList().stream()
                        .map(MovieCast::getData)
                        .map(java.util.List::size)
                        .filter(i -> i == 0)
                        .count());
    }

    @Test
    public void receiveNullMoviesCast() throws IOException {
        List<Movie> completeMovies = ControllerTestUtils.getCompleteMovieList();

        when(movieService.getMoviesCast()).thenReturn(
                completeMovies.map(i -> new MovieCast(i.getTitle(), i.getId(), null))
                        .toJavaList());

        assertEquals("If movies receive empty casts, at least one cast-list is non-empty",
                completeMovies.map(i -> new MovieCast(i.getTitle(), i.getId(), new ArrayList<>()))
                        .toJavaList(), controller.getMovieCastList());
    }

    @Test
    public void receiveEmptyMoviesCast() throws IOException {
        List<Movie> incompleteMovies = ControllerTestUtils.getPartialMovieList();

        when(movieService.getMoviesCast()).thenReturn(
                incompleteMovies.map(i -> new MovieCast(i.getTitle(), i.getId(), new ArrayList<>()))
                        .toJavaList());

        assertEquals("If movies receive empty casts, at least one cast-list is non-empty",
                0, controller.getMovieCastList().stream()
                        .mapToInt(i -> i.getData().size())
                        .sum());
    }

    @Test
    public void receiveEmptyMoviesList() throws IOException {
        ArrayList<Movie> emptyMovieList = new ArrayList<>();
        when(movieService.getPopularMovies()).thenReturn(emptyMovieList);
        assertEquals("Receiving an empty list of movies, the size of the list os not 0",
                0, controller.getMoviesList().size());
    }

    @Test
    public void receiveEmptyMoviesListForCast() throws IOException {
        when(movieService.getMoviesCast()).thenReturn(new ArrayList<>());
        assertEquals("Receiving an empty list of MovieCast objects, the object returned is not an empty list. Check for nulls",
                new ArrayList(), controller.getMovieCastList());
    }

    @Test
    public void receiveIncompleteMoviesList() throws IOException {
        List<Movie> incompleteMovies = ControllerTestUtils.getPartialMovieList();
        when(movieService.getPopularMovies()).thenReturn(incompleteMovies.toJavaList());
        assertEquals("When receiving an incomplete list of movies (less than 20), the controller is not returning " +
                "the expected result list", incompleteMovies.asJava(), controller.getMoviesList());
    }

    @Test
    public void databaseNotConnectedStoringCasts() {
        List<MovieCast> movieCast = getTypeMovieList(20, "MovieCast").map(i -> (MovieCast) i);
        when(databaseService.storeMoviesCast(movieCast.asJava())).thenReturn(-1);
        assertEquals("When calling the storing casts function of the database, the result code is not (-1) or error",
                -1, controller.storeMoviesCast(movieCast.asJava()));
    }

    @Test
    public void databaseNotConnectedStoringRank() {
        List<MovieRank> movieRank = getTypeMovieList(20, "MovieRank").map(i -> (MovieRank) i);
        when(databaseService.storeTodaysPopularMovies(movieRank.asJava())).thenReturn(-1);
        assertEquals("When calling the storing today's ranks function of the database, the result code is not (-1) or error",
                -1, controller.storeMoviesRank(movieRank.asJava()));
    }

    @Test
    public void happyPathDatabaseStoringCasts() {
        List<MovieCast> movieCast = getTypeMovieList(20, "MovieCast").map(i -> (MovieCast) i);
        when(databaseService.storeMoviesCast(movieCast.asJava())).thenReturn(0);
        assertEquals("When calling the storing today's ranks function of the database, the result code is not (0) or success",
                0, controller.storeMoviesCast(movieCast.asJava()));
    }

    @Test
    public void happyPathDatabaseStoringRank() {
        List<MovieRank> movieRank = getTypeMovieList(20, "MovieRank").map(i -> (MovieRank) i);
        when(databaseService.storeTodaysPopularMovies(movieRank.asJava())).thenReturn(0);
        assertEquals("When calling the storing today's ranks function of the database, the result code is not (0) or success",
                0, controller.storeMoviesRank(movieRank.asJava()));
    }*/
}