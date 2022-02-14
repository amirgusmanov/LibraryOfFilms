package com.company.CallFunctions;

import com.company.Function.Function;
import com.company.Movie.Movie;
import com.company.Movie.MovieRepository;

import java.util.Objects;

/**
 * Class that print movie by its <b>name</b> and <b>year</b>
 */
public class FindFunction implements Function {     //ready

    private MovieRepository repository;
    private Movie movie;

    private String name;
    private int year;

    /**
     * Creating an object with <b>name</b> and <b>year</b>
     * @param repository
     * @param name
     * @param year
     */
    public FindFunction(MovieRepository repository, String name, int year) {
        this.repository = repository;
        this.name = name;
        this.year = year;
    }

    /**
     * Method to get <b>repository</b>
     * @return  repository
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
     * Overriding method which iterates over the array and finds needed movie
     */
    @Override
    public void function() {
        for(Movie movie : repository.getMovieRepositoryList()){
            if(movie.getName().equals(name) && year == movie.getYear()){
                System.out.println(movie);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FindFunction that = (FindFunction) o;
        return year == that.year && Objects.equals(repository, that.repository) && Objects.equals(movie, that.movie) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository, movie, name, year);
    }

    @Override
    public String toString() {
        return "FindFunction{" +
                "repository=" + repository +
                ", movie=" + movie +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
