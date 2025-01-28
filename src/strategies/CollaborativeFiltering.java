package src.strategies;

import src.models.Movie;
import src.models.User;
import java.util.*;

public class CollaborativeFiltering extends RecommendationStrategy {
    @Override
    public List<Movie> recommend(List<User> users, User targetUser) {
        System.out.println("Collaborative Filtering Recommendations");
        Set<Movie> recommended = new HashSet<>();
        for (User user : users) {
            if (!user.equals(targetUser)) {
                for (Movie movie : user.getRatings().keySet()) {
                    if (!targetUser.getRatings().containsKey(movie)) {
                        recommended.add(movie);
                    }
                }
            }
        }
        return new ArrayList<>(recommended);
    }
}



