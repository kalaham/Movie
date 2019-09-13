package com.prueba.bean;

import com.prueba.dao.movieDAO;
import com.prueba.model.Movie;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class movieBean {

    private Movie movie = new Movie();

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void register() throws Exception {
        movieDAO dao;
        try {
            dao = new movieDAO();
            dao.register(movie);
        } catch (Exception e) {
            throw e;
        }

    }
}
