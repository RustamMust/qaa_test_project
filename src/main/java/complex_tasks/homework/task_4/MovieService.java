package complex_tasks.homework.task_4;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class MovieService {
    private final Map<Movie, List<Rating<? extends Number>>> ratings = new ConcurrentHashMap<>();

    // Добавляем рейтинг к фильму
    public void addRating(Movie movie, Rating<? extends Number> rating) {
        double value = rating.getValue().doubleValue();

        if (value < 1.0 || value > 10.0) {
            throw new IllegalArgumentException("Рейтинг должен быть от 1 до 10.");
        }

        List<Rating<? extends Number>> list = ratings.get(movie);

        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            ratings.put(movie, list);
        }

        list.add(rating);
    }

    // Получение средней оценки фильма
    public double getAverageRating(Movie movie) {
        List<Rating<? extends Number>> list = ratings.get(movie);

        if (list == null || list.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (Rating<? extends Number> r : list) {
            sum += r.getValue().doubleValue();
        }
        return sum / list.size();
    }


    public List<Movie> getMovieSortedByRating() {
        return ratings.keySet().stream()
                .sorted((movie1, movie2) -> Double.compare(getAverageRating(movie2), getAverageRating(movie1)))
                .collect(Collectors.toList());
    }


}
