/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierecsys.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import movierecsys.be.Movie;
import movierecsys.bll.MovieLogic;
import movierecsys.bll.OwsLogicFacade;

/**
 *
 * @author pgn
 */
public class MovieRecController implements Initializable
{


    private OwsLogicFacade movieLogic;
    public MovieRecController() {
        this.movieLogic = new MovieLogic();
    }
    /**
     * The TextField containing the URL of the targeted website.
     */
    @FXML
    private TextField txtMovieSearcjh;

    /**
     * The TextField containing the query word.
     */
    @FXML
    private ListView<Movie> lstMovies;


    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
       lstMovies.setItems(FXCollections.observableArrayList(movieLogic.searchMovies(this.txtMovieSearcjh.getText())));
        
    }

    @FXML
    public void search() {
        lstMovies.setItems(FXCollections.observableArrayList(movieLogic.searchMovies(this.txtMovieSearcjh.getText())));

    }
}