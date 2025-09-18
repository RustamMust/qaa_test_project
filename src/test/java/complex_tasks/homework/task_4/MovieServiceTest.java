package complex_tasks.homework.task_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieServiceTest {
    private MovieService movieService;
    private Movie departedFilm;
    private Movie prestigeFilm;
    private Movie djangoFilm;

    @BeforeEach
    public void setUp() {
        movieService = new MovieService();
        departedFilm = new Movie("Departed");
        prestigeFilm = new Movie("Prestige");
        djangoFilm = new Movie("Django");
    }

    @Test
    public void addAndGetAverageRatingTest() {
        Rating<Integer> rating1 = new Rating<>(9);
        Rating<Double> rating2 = new Rating<>(8.0);

        movieService.addRating(departedFilm, rating1);
        movieService.addRating(departedFilm, rating2);

        double average = movieService.getAverageRating(departedFilm);

        assertEquals(8.5, average);
    }

    @Test
    public void addInvalidRating() {
        Rating<Integer> highRating = new Rating<>(15);
        Rating<Double> lowRating = new Rating<>(0.0);

        assertThrows(IllegalArgumentException.class, () -> movieService.addRating(prestigeFilm, highRating));
        assertThrows(IllegalArgumentException.class, () -> movieService.addRating(prestigeFilm, lowRating));
    }

    @Test
    public void moviesCanBeSortedByRatingTest() {
        Rating<Integer> rating1 = new Rating<>(9);
        Rating<Double> rating2 = new Rating<>(7.0);
        Rating<Double> rating3 = new Rating<>(6.0);
        Rating<Double> rating4 = new Rating<>(7.5);
        Rating<Double> rating5 = new Rating<>(5.0);

        movieService.addRating(departedFilm, rating1);
        movieService.addRating(departedFilm, rating2);

        movieService.addRating(prestigeFilm, rating3);
        movieService.addRating(prestigeFilm, rating4);

        movieService.addRating(djangoFilm, rating5);

        List<Movie> sortedList = movieService.getMovieSortedByRating();

        assertEquals(departedFilm, sortedList.getFirst());
        assertEquals(prestigeFilm, sortedList.get(1));
        assertEquals(djangoFilm, sortedList.get(2));


    }


}
