package com.company.Function;

import com.company.CallFunctions.*;
import com.company.Movie.MovieRepository;

import java.util.Objects;

/**
 * Class that assigned to generate {@link com.company.CallFunctions} as objects
 * @author Amir Gusmanov
 */
public class FunctionGenerator implements FunctionParser {

    /**
     * <b>repository</b> is the link to {@link MovieRepository}
     */
    public MovieRepository repository;

    /**
     * Creating a new object with <b>repository</b>
     * @param repository
     */
    public FunctionGenerator(MovieRepository repository) {
        this.repository = repository;
    }

    /**
     * Overriding method which splitting command line into array elements,
     * and then defines which {@link com.company.CallFunctions} is it
     *
     * @author Amir Gusmanov
     * @param type
     * @return functions
     */
    @Override
    public Function command(String type) {

        String[] words = type.split(" ");
        String firstWordFunction = words[0];

        switch(firstWordFunction) {
            case "create":
                return new CreateFunction(repository, Integer.parseInt(words[1]), words[2], Integer.parseInt(words[3]), words[4], Double.parseDouble(words[5]));

            case "update":
                return new UpdateFunction(repository, Integer.parseInt(words[1]), words[2], Integer.parseInt(words[3]), words[4], Double.parseDouble(words[5]));

            case "show":
                return new ShowFunction(repository, Integer.parseInt(words[1]));

            case "find":
                return new FindFunction(repository, words[1], Integer.parseInt(words[2]));

            case "list":
                return new ListFunction(repository);

        }
        switch(type) {
            case "sort by rating":
                return new SortByRatingFunction(repository);

            case "sort by year":
                return new SortByYearFunction(repository);

            default:
                throw new RuntimeException("Unknown command, please try again");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FunctionGenerator that = (FunctionGenerator) o;
        return Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository);
    }

    @Override
    public String toString() {
        return "FunctionGenerator{" +
                "repository=" + repository +
                '}';
    }
}
