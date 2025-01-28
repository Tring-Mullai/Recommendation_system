package src.models;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String userId;
    private String name;
    private Map<Movie, Double> ratings;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.ratings = new HashMap<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Map<Movie, Double> getRatings() {
        return ratings;
    }

    public void rateMovie(Movie movie, double rating) {
        ratings.put(movie, rating);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", ratings=" + ratings.keySet() +
                '}';
    }
}
