package src.strategies;

import src.models.Movie;
import src.models.User;
import java.util.List;

public abstract class RecommendationStrategy {
    public abstract List<Movie> recommend(List<User> users, User targetUser);
}

