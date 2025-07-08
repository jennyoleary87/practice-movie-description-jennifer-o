package org.example;

import org.example.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.apache.http.HttpException;
import java.io.IOException;

@Controller
public class MovieController {

    // store movies
    private List<Movie> movies = new ArrayList<>();
    Client client = new Client();

    @GetMapping("/")
    @ResponseBody
    public String home() {

        return "<html>"
                + "<head><title>Movie Management</title></head>"
                + "<body>"
                + "<h1>Movie Management System</h1>"
                + "<h2>Add a New Movie</h2>"
                + "<form action='/add' method='post'>"
                + "<p>Movie Title: <input type='text' name='title' required></p>"
                + "<p>Rating (1-10): <input type='number' name='rating' min='1' max='10' required></p>"
                + "<p><input type='submit' value='Add Movie'></p>"
                + "</form>";
    }

    private String generateMovieDescription(String movieTitle) {
        try {
            String query = "Generate a brief, 2-3 sentence engaging description for the movie titled " + movieTitle;
            GenerateContentResponse response = client.models.generateContent("gemini-2.0-flash-001", query, null);
            return response.text();
        } catch (IOException | HttpException e) {
            return "error";
        }
    }

    @PostMapping("/add")
    @ResponseBody
    public String addMovie(@RequestParam String title, @RequestParam double rating) {
        try {

            String description = generateMovieDescription(title);
            Movie movie = new Movie(title, rating, description);
            movies.add(movie);

            return "<html><body>"
                    + "<p><strong>Title:</strong> " + title + "</p>"
                    + "<p><strong>Rating:</strong> " + rating + "</p>"
                    + "</body></html>" ;
        } catch (Exception e) {
            return "<html><body>"
                    + "<p> error </p>"
                    + "</body></html>" ;
        }
    }
};

//@GetMapping("/add")
//public string renderAdd(){
//    return "<html>" + "<body>" + "<form ... >" + "<p> enter name: </p>" + ...
