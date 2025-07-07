package org.example;

public class Movie {
    public String title;
    public double rating;
    public String description;

    public Movie() {}

    Movie(String title, double rating, String description) {
        this.title = title;
        this.rating = rating;
        this.description = description;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
