package com.company.Exceptions;

import com.company.Movie.Movie;
import com.company.Movie.MovieRepository;

/**
 * Exception that should be thrown if some movies will have
 * similar name and year
 * @author Amir Gusmanov
 */
public class SimilarNameYearException extends RuntimeException{

    MovieRepository repository;
    Movie movie;

    public SimilarNameYearException(String try_again, MovieRepository repository, Movie movie) {
        this.repository = repository;
        this.movie = movie;
    }

    public SimilarNameYearException(String message, Movie movie) {
        super(String.format("This movie {%s} has the similar name with the previous one, similar year", movie.getName()));
        this.repository = repository;
        this.movie = movie;
    }

    public SimilarNameYearException(String message, Throwable cause, MovieRepository repository, Movie movie) {
        super(String.format("This movie {%s} has the similar name with the previous one, similar year", movie.getName()), cause);
        this.repository = repository;
        this.movie = movie;
    }

    public SimilarNameYearException(Throwable cause, MovieRepository repository, Movie movie) {
        super(cause);
        this.repository = repository;
        this.movie = movie;
    }

    public SimilarNameYearException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, MovieRepository repository, Movie movie) {
        super(String.format("This movie {%s} has the similar name with the previous one, similar year", movie.getName()), cause, enableSuppression, writableStackTrace);
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
