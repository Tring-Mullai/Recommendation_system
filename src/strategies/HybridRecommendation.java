package src.strategies;

import src.models.Movie;
import src.models.User;

import java.util.*;

public class HybridRecommendation extends RecommendationStrategy {
    private CollaborativeFiltering collaborative;
    private ContentBasedFiltering contentBased;

    public HybridRecommendation() {
        this.collaborative = new CollaborativeFiltering();
        this.contentBased = new ContentBasedFiltering();
    }

    @Override
    public List<Movie> recommend(List<User> users, User targetUser) {
        System.out.println("Hybrid Recommendations");
        List<Movie> collabRecommendations = collaborative.recommend(users, targetUser);
        List<Movie> contentRecommendations = contentBased.recommend(users, targetUser);

        Set<Movie> combined = new HashSet<>(collabRecommendations);
        combined.addAll(contentRecommendations);
        return new ArrayList<>(combined);
    }
}
