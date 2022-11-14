package movierecsys.bll;

import movierecsys.be.Movie;
import movierecsys.be.Rating;
import movierecsys.be.User;
import movierecsys.dal.*;

import java.util.List;
import java.util.stream.Collectors;

public class MovieLogic implements OwsLogicFacade{

    private MovieDAOFacade movieDAO;
    private RatingDAO ratingDAO;
    private UserDAO userDAO;

    public MovieLogic() {
        movieDAO = new MovieFileDAO();
        ratingDAO = new RatingDAO();
        userDAO = new UserDAO();
    }

    @Override
    public List<Rating> getRecommendedMovies(User user) {
        return null;
    }

    @Override
    public List<Movie> getAllTimeTopRatedMovies() {
        return null;
    }

    @Override
    public List<Movie> getMovieReccomendations(User user) {
        return null;
    }

    @Override
    public List<Movie> searchMovies(String query) {
        return movieDAO
                .getAllMovies()
                .stream()
                .filter(movie -> movie.getTitle()
                        .toLowerCase()
                        .contains(query.toLowerCase())).collect(Collectors.toList());
    }

    @Override
    public Movie createMovie(int year, String title) {
        return null;
    }

    @Override
    public void updateMovie(Movie movie) {

    }

    @Override
    public void deleteMovie(Movie movie) {

    }

    @Override
    public void rateMovie(Movie movie, User user, int rating) {

    }

    @Override
    public User createNewUser(String name) {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
