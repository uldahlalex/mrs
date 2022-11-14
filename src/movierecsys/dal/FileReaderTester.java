/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierecsys.dal;

import java.io.IOException;
import java.util.List;

import movierecsys.be.Movie;

/**
 *
 * @author pgn
 */
public class FileReaderTester
{

    /**
     * Example method. This is the code I used to create the users.txt files.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        MovieFileDAO movieDao = new MovieFileDAO();
        List<Movie> allMovs = movieDao.getAllMovies();
        for (Movie allMov : allMovs)
        {
            System.out.println(allMov.getTitle());
        }
        System.out.println("Movie count: " + allMovs.size());
    }

   
}
