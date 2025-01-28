package src.models;

public class Movie {
    private String movieId;
    private String title;
    private String genre;
    private double rating;

    public Movie(String movieId, String title, String genre, double rating) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
