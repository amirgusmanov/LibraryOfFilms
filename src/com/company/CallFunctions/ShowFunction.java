package com.company.CallFunctions;

import com.company.Function.Function;
import com.company.Movie.Movie;
import com.company.Movie.MovieRepository;

import java.util.Objects;

/**
 * Class that prints out movie by <b>id</b>
 */
public class ShowFunction implements Function{     //ready

    private MovieRepository repository;
    private Movie movie;

    private int id;

    /**
     * Creating an object with <b>repository</b> <b>id</b>
     * @param repository
     * @param id
     */
    public ShowFunction(MovieRepository repository, int id) {
        this.repository = repository;
        this.id = id;
    }

    /**
     * Method to get <b>repository</b>
     * @return repository
     */
    public MovieRepository getRepository() {
        return repository;
    }

    /**
     * Method to set repository
     * @param repository
     */
    public void setRepository(MovieRepository repository) {
        this.repository = repository;
    }

    /**
     * Overriding method which iterates over the array and finds needed movie
     */
    @Override
    public void function() {
        for(Movie movie : repository.getMovieRepositoryList()){
            if(id == movie.getId()){
                System.out.println(movie);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowFunction that = (ShowFunction) o;
        return id == that.id && Objects.equals(repository, that.repository) && Objects.equals(movie, that.movie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository, movie, id);
    }

    @Override
    public String toString() {
        return "ShowFunction{" +
                "repository=" + repository +
                ", movie=" + movie +
                ", id=" + id +
                '}';
    }
}
