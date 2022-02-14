package com.company.Exceptions;

import com.company.Movie.Movie;
import com.company.Movie.MovieRepository;

/**
 * Exception that should be thrown if some movies will have similar ID
 * @author Amir Gusmanov
 */
public class SimilarIDException extends RuntimeException {

    MovieRepository repository;
    Movie movie;

    public SimilarIDException(String message, MovieRepository repository, Movie movie) {
        super(String.format("This {%s} id is similar to the previous one", movie.getId()));
        this.movie = movie;
    }

    public SimilarIDException(String message, Throwable cause, MovieRepository repository, Movie movie) {
        super(String.format("This {%s} id is similar to the previous one", movie.getId()), cause);
        this.repository = repository;
        this.movie = movie;
    }

    public SimilarIDException(Throwable cause, MovieRepository repository, Movie movie) {
        super(cause);
        this.repository = repository;
        this.movie = movie;
    }

    public SimilarIDException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, MovieRepository repository, Movie movie) {
        super(String.format("This {%s} id is similar to the previous one", movie.getId()), cause, enableSuppression, writableStackTrace);
        this.repository = repository;
        this.movie = movie;
    }

    public MovieRepository getRepository() {
        return repository;
    }

    public void setRepository(MovieRepository repository) {
        this.repository = repository;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
