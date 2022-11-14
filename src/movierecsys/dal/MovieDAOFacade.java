package movierecsys.dal;

import movierecsys.be.Movie;

import java.util.List;

public interface MovieDAOFacade {
    List<Movie> getAllMovies();

    /**
     * Reads a movie from a , s
     *
     * @param t
     * @return
     * @throws NumberFormatException
     */
     Movie stringArrayToMovie(String t);

    /**
     * Creates a movie in the persistence storage.
     *
     * @param releaseYear The release year of the movie
     * @param title       The title of the movie
     * @return The object representation of the movie added to the persistence
     * storage.
     */
     Movie createMovie(int releaseYear, String title);

    /**
     * Deletes a movie from the persistence storage.
     *
     * @param movie The movie to delete.
     */
     void deleteMovie(Movie movie);

    /**
     * Updates the movie in the persistence storage to reflect the values in the
     * given Movie object.
     *
     * @param movie The updated movie.
     */
    void updateMovie(Movie movie);

    /**
     * Gets a the movie with the given ID.
     *
     * @param id ID of the movie.
     * @return A Movie object.
     */
    Movie getMovie(int id);
}
