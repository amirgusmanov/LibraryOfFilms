package com.company.CallFunctions;

import com.company.Function.Function;
import com.company.Movie.Movie;
import com.company.Movie.MovieRepository;

import java.util.Objects;

/**
 * Class that outputs all movies from {@link MovieRepository}
 * @author Amir Gusmanov
 */
public class ListFunction implements Function{     //ready

    private MovieRepository repository;
    private Movie movie;

    /**
     * Creating an object with <b>repository</b>
     * @param repository
     */
    public ListFunction(MovieRepository repository) {
        this.repository = repository;
    }

    /**
     * Method to get <b>repository</b>
     * @return repository
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
     * Overriding method which prints all movies
     */
    @Override
    public void function() {
        System.out.println(repository.getMovieRepositoryList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListFunction that = (ListFunction) o;
        return Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository);
    }

    @Override
    public String toString() {
        return "ListFunction{" +
                "repository=" + repository +
                '}';
    }
}
