package src.strategies;

import src.models.Movie;
import src.models.User;

import java.util.*;

public class ContentBasedFiltering extends RecommendationStrategy {
    @Override
    public List<Movie> recommend(List<User> users, User targetUser) {
        System.out.println("Content-Based Filtering Recommendations");
        Set<String> likedGenres = new HashSet<>();
        for (Map.Entry<Movie, Double> entry : targetUser.getRatings().entrySet()) {
            if (entry.getValue() > 3.5) {
                likedGenres.add(entry.getKey().getGenre());
            }
        }

        Set<Movie> recommended = new HashSet<>();
        for (User user : users) {
            for (Movie movie : user.getRatings().keySet()) {
                if (likedGenres.contains(movie.getGenre()) && !targetUser.getRatings().containsKey(movie)) {
                    recommended.add(movie);
                }
            }
        }
        return new ArrayList<>(recommended);
    }
}

