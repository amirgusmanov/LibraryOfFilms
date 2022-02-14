package com.company.Movie;

import java.util.Objects;

/**
 * Class movie with properties: <b>id</b>, <b>name</b>, <b>year</b>, <b>genre</b>, <b>rating</b>
 * @author Amir Gusmanov
 */
public class Movie {

    private int id;
    private String name;
    private int year;
    private String genre;
    private double rating;

    /**
     * Creating a new object with <b>id</b>, <b>name</b>, <b>year</b>, <b>genre</b>, <b>rating</b>
     * @param id
     * @param name
     * @param year
     * @param genre
     * @param rating
     */
    public Movie(int id, String name, int year, String genre, double rating) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    /**
     * Method to get <b>id</b> value
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Method to set <b>id</b> value
     * @param id
     */
    public void setId(int id) { this.id = id; }

    /**
     * Method to get <b>name</b> value
     * @return name
     */
    public String getName() { return name; }

    /**
     * Method to set <b>name</b> value
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get <b>year</b> value
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * Method to set <b>year</b> value
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Method to get <b>genre</b> value
     * @return genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Method to set <b>genre</b> value
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Method to get <b>rating</b> value
     * @return rating
     */
    public double getRating() {
        return rating;
    }

    /**
     * Method to set <b>rating</b> value
     * @param rating
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id && year == movie.year && Double.compare(movie.rating, rating) == 0 && Objects.equals(name, movie.name) && Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, year, genre, rating);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }

}

