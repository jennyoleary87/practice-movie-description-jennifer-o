package org.example;

@Controller
public class MovieController {

    // store movies
    private List<Movie> movies = new ArrayList<>();

    @GetMapping("/")
    @ResponseBody
    public String home() {

        return "<html>"
                + ("<head><title>Movie Management</title></head>")
                + ("<body>")
                + ("<h1>Movie Management System</h1>")
                + ("<h2>Add a New Movie</h2>")
                + ("<form action='/add' method='post'>")
                + ("<p>Movie Title: <input type='text' name='title' required></p>")
                + ("<p>Rating (1-10): <input type='number' name='rating' min='1' max='10' step='0.1' required></p>")
                + ("<p><input type='submit' value='Add Movie'></p>")
                + ("</form>")
                + ("<hr>")
                + ("<h2>All Movies</h2>");

}
