package model;

import java.util.List;

/**
 * Represents a movie available for booking.
 * Demonstrates Encapsulation and the use of Collections (List).
 */
public class Movie {
    private String title;
    private double price;
    private List<String> timings;

    // Constructor
    public Movie(String title, double price, List<String> timings) {
        this.title = title;
        this.price = price;
        this.timings = timings;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getTimings() {
        return timings;
    }

    /**
     * Displays all available timings for this movie.
     */
    public void displayTimings() {
        for (int i = 0; i < timings.size(); i++) {
            System.out.println((i + 1) + ". " + timings.get(i));
        }
    }
}
