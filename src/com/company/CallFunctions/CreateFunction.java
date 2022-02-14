package com.company.CallFunctions;

import com.company.Exceptions.SimilarIDException;
import com.company.Exceptions.SimilarNameYearException;
import com.company.Function.Function;
import com.company.Movie.Movie;
import com.company.Movie.MovieRepository;

import java.util.Objects;

/**
 * Class that creating an {@link Movie} object, adds into {@link MovieRepository} list
 * @author Amir Gusmanov
 */
public class CreateFunction implements Function {   //ready

    private MovieRepository repository;

    int id;
    String name;
    int year;
    String genre;
    double rating;

    /**
     * Create an object with <b>repository</b>,<b>id</b>, <b>name</b>, <b>year</b>, <b>genre</b>, <b>rating</b>
     * @param repository
     * @param id
     * @param name
     * @param year
     * @param genre
     * @param rating
     */
    public CreateFunction(MovieRepository repository, int id, String name, int year, String genre, double rating) {
        this.repository = repository;
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    /**
     * Method to get <b>repository</b> value
     * @return repository
     */
    public MovieRepository getRepository() {
        return repository;
    }

    /**
     * Method to set <b>repository</b> value
     * @param repository
     */
    public void setRepository(MovieRepository repository) {
        this.repository = repository;
    }

    /**
     * Overriding method, which firstly checking movie for repetitions exception,
     * if true, adds <b>movie</b> into repository
     */
    @Override
    public void function() {
        for(Movie movie : repository.getMovieRepositoryList()){
            if(id == movie.getId()){
                repository.getMovieRepositoryList().remove(movie);
                throw new SimilarIDException("try again", repository, movie);
            }
        }
        for(Movie movie : repository.getMovieRepositoryList()) {
            if (name.equals(movie.getName()) && year == movie.getYear()) {
                repository.getMovieRepositoryList().remove(movie);
                throw new SimilarNameYearException("try again", repository, movie);
            }
        }
        if(rating < 0.0 || rating > 10.0){
            throw new RuntimeException("rating can't be more than 10.0 or less than 0.0");
        }
        repository.getMovieRepositoryList().add(new Movie(id, name, year, genre, rating));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateFunction that = (CreateFunction) o;
        return id == that.id && year == that.year && Double.compare(that.rating, rating) == 0 && Objects.equals(repository, that.repository) && Objects.equals(name, that.name) && Objects.equals(genre, that.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository, id, name, year, genre, rating);
    }

    @Override
    public String toString() {
        return "CreateFunction{" +
                "repository=" + repository +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
