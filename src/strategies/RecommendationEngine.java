package src.strategies;

import src.models.Movie;
import src.models.User;
import java.util.List;

public class RecommendationEngine {
    private RecommendationStrategy strategy;

    public void setStrategy(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Movie> recommendMovies(List<User> users, User targetUser) {
        return strategy.recommend(users, targetUser);
    }
}
