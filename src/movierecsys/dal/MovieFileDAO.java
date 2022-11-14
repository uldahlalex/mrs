/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierecsys.dal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import movierecsys.be.Movie;

/**
 * @author pgn
 */
public class MovieFileDAO implements MovieDAOFacade {

    private static final String MOVIE_SOURCE = "data/movie_titles.txt";

    /**
     * Gets a list of all movies in the persistence storage.
     *
     * @return List of movies.
     * @throws java.io.FileNotFoundException
     */
    @Override
    public List<Movie> getAllMovies() {
        List<Movie> allMovies = new ArrayList<>();
        File file = new File(MOVIE_SOURCE);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    Movie mov = stringArrayToMovie(line);
                    allMovies.add(mov);
                } catch (Exception ex) {
                }
            }
        } catch (Exception e) {

        }
        System.out.println(allMovies.size());
        return allMovies;
    }

    @Override
    public Movie stringArrayToMovie(String t) {
        String[] arrMovie = t.split(",");

        int id = Integer.parseInt(arrMovie[0]);
        int year = Integer.parseInt(arrMovie[1]);
        String title = arrMovie[2];
        if (arrMovie.length > 3) {
            for (int i = 3; i < arrMovie.length; i++) {
                title += "," + arrMovie[i];
            }
        }
        Movie mov = new Movie(id, year, title);
        return mov;
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
