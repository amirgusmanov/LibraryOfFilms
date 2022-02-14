package com.company.CallFunctions;

import com.company.Function.Function;
import com.company.Movie.Movie;
import com.company.Movie.MovieRepository;

import java.util.Objects;

/**
 * Class that update movie parameters by <b>id</b>
 */
public class UpdateFunction implements Function {       //ready

    private MovieRepository repository;

    private int id;
    private String name;
    private int year;
    private String genre;
    private double rating;

    /**
     * Creating an object with <b>repository</b> <b>id</b> <b>name</b> <b>year</b> <b>genre</b> <b>rating</b>
     * @param repository
     * @param id
     * @param name
     * @param year
     * @param genre
     * @param rating
     */
    public UpdateFunction(MovieRepository repository, int id, String name, int year, String genre, double rating) {
        this.repository = repository;
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
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
     * Overriding method that iterates over the array and set new Movie with dif parameters
     */
    @Override
    public void function() {
        for(Movie movie : repository.getMovieRepositoryList()){
            if(id == movie.getId()){
                repository.getMovieRepositoryList().set(repository.getMovieRepositoryList().indexOf(movie), new Movie(id, name, year, genre, rating));
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateFunction that = (UpdateFunction) o;
        return id == that.id && year == that.year && Double.compare(that.rating, rating) == 0 && Objects.equals(repository, that.repository) && Objects.equals(name, that.name) && Objects.equals(genre, that.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository, id, name, year, genre, rating);
    }

    @Override
    public String toString() {
        return "UpdateFunction{" +
                "repository=" + repository +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}