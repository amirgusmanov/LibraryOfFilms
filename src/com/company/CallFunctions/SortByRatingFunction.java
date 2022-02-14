package com.company.CallFunctions;

import com.company.Function.Function;
import com.company.Movie.Movie;
import com.company.Movie.MovieRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 * Class that sorts movies in descending order
 * @author Amir Gusmanov
 */
public class SortByRatingFunction implements Function{   //descending sorting - ready

    private MovieRepository repository;
    private Movie movie;

    /**
     * Creating an object with <b>repository</b>
     * @param repository
     */
    public SortByRatingFunction(MovieRepository repository) {
        this.repository = repository;
    }

    /**
     * Method to get <b>repository</b>
     * @return
     */
    public MovieRepository getRepository() {
        return repository;
    }

    /**
     * Method to set <b>repository</b>
     * @param repository
     */
    public void setRepository(MovieRepository repository) {
        this.repository = repository;
    }

    /**
     * Overriding method which sort movies in descending order by <b>rating</b>
     */
    @Override
    public void function() {
        repository.getMovieRepositoryList().sort(Collections.reverseOrder(Comparator.comparing(movie -> movie.getRating())));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortByRatingFunction that = (SortByRatingFunction) o;
        return Objects.equals(repository, that.repository) && Objects.equals(movie, that.movie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository, movie);
    }

    @Override
    public String toString() {
        return "SortByRatingFunction{" +
                "repository=" + repository +
                ", movie=" + movie +
                '}';
    }

}
