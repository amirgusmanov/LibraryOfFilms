package com.company.Movie;

import java.util.*;

/**
 * The MovieRepository class contains <b>movieRepositoryList</b>
 * to which movies are added
 * @author Amir Gusmanov
 */
public class MovieRepository {

    private List<Movie> movieRepositoryList;

    /**
     * Constructor initialize <b>movieRepositoryList</b> to ArrayList
     */
    public MovieRepository() {
        movieRepositoryList = new ArrayList<>();
    }

    /**
     * Creating a new object with <b>movieRepositoryList</b>
     * @param movieRepositoryList
     */
    public MovieRepository(List<Movie> movieRepositoryList) {
        this.movieRepositoryList = movieRepositoryList;
    }

    /**
     * Method to get the <b>movieRepositoryList</b> value
     * @return movieRepositoryList
     */
    public List<Movie> getMovieRepositoryList() { return movieRepositoryList; }

    /**
     * Method to set <b>movieRepositoryList</b>
     * @param movieRepositoryList
     */
    public void setMovieRepositoryList(List<Movie> movieRepositoryList) { this.movieRepositoryList = movieRepositoryList; }

    /**
     * Method adds object <b>movie</b> to <b>movieRepositoryList</b>
     * @param movie - movie
     */
    public void movieRepository(Movie movie){ movieRepositoryList.add(movie); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieRepository that = (MovieRepository) o;
        return Objects.equals(movieRepositoryList, that.movieRepositoryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieRepositoryList);
    }

    @Override
    public String toString() {
        return "MovieRepository{" +
                "movieRepositoryList=" + movieRepositoryList +
                '}';
    }
}
