package src;

import src.models.Movie;
import src.models.User;
import src.strategies.CollaborativeFiltering;
import src.strategies.ContentBasedFiltering;
import src.strategies.HybridRecommendation;
import src.strategies.RecommendationEngine;
import java.util.*;



public class MovieRecommendationApp {
    public static void main(String[] args) {
        // Movies
        Movie movie1 = new Movie("1", "Inception", "Sci-Fi", 4.8);
        Movie movie2 = new Movie("2", "Titanic", "Romance", 4.7);
        Movie movie3 = new Movie("3", "The Matrix", "Sci-Fi", 4.6);
        Movie movie4 = new Movie("4", "The Notebook", "Romance", 4.5);
        Movie movie5 = new Movie("5", "Avengers", "Action", 4.7);

        // Users
        User user1 = new User("U1", "Alice");
        User user2 = new User("U2", "Bob");
        User user3 = new User("U3", "Charlie");

        user1.rateMovie(movie1, 5.0);
        user1.rateMovie(movie2, 4.5);

        user2.rateMovie(movie3, 4.0);
        user2.rateMovie(movie4, 4.5);

        user3.rateMovie(movie5, 5.0);
        user3.rateMovie(movie1, 4.0);

        List<User> users = Arrays.asList(user1, user2, user3);

        // Recommendation Engine
        RecommendationEngine engine = new RecommendationEngine();

        // Collaborative Filtering
        engine.setStrategy(new CollaborativeFiltering());
        System.out.println(engine.recommendMovies(users, user1));

        // Content-Based Filtering
        engine.setStrategy(new ContentBasedFiltering());
        System.out.println(engine.recommendMovies(users, user1));

        // Hybrid Recommendation
        engine.setStrategy(new HybridRecommendation());
        System.out.println(engine.recommendMovies(users, user1));
    }
}
