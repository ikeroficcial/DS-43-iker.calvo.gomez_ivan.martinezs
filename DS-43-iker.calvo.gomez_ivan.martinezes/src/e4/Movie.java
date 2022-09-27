package e4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

public class Movie {
    String title;
    Collection<MovieRating> ratings = new ArrayList<>();

    Movie(String title) {
        this.title = title;
        this.ratings.add(MovieRating.NOT_RATED);
    }

    public String getTitle() {
        return title;
    }

    public void insertRating(MovieRating movieRating) {
        if (!this.isRated()) {
            ratings.remove(MovieRating.NOT_RATED);
        }
        ratings.add(movieRating);
    }

    private boolean isRated() {
        return !ratings.contains(MovieRating.NOT_RATED);
    }

    public MovieRating maximumRating() {
        MovieRating result = MovieRating.NOT_RATED;
        for (MovieRating m : ratings) {
            if (m.isBetterThan(result)) {
                result = m;
            }
        }
        return result;
    }

    public double averageRating() {
        double result = 0;
        int contador = 0;
        if (!this.isRated()){
            throw new NoSuchElementException();
        }
        for (MovieRating m : ratings) {
            if (m.isBetterThan(MovieRating.NOT_RATED)){
            result += m.getNumericRating();
            contador++;
            }
        }
        result = result / contador;
        return result;
    }
}
