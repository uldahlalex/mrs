package movierecsys.dal;

import movierecsys.be.Movie;

import java.util.List;

public class MovieDbDAO implements MovieDAOFacade {
    @Override
    public List<Movie> getAllMovies() {
        return null;
    }

    @Override
    public Movie stringArrayToMovie(String t) {
        return null;
    }

    @Override
    public Movie createMovie(int releaseYear, String title) {
        return null;
    }

    @Override
    public void deleteMovie(Movie movie) {

    }

    @Override
    public void updateMovie(Movie movie) {

    }

    @Override
    public Movie getMovie(int id) {
        return null;
    }
}
