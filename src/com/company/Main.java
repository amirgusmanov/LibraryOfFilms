package com.company;

import com.company.Function.Function;
import com.company.Function.FunctionGenerator;
import com.company.Movie.MovieRepository;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MovieRepository repository = new MovieRepository();
        FunctionGenerator functionGenerator = new FunctionGenerator(repository);

        while (true) {
            Function function1 = functionGenerator.command(scanner.nextLine());
            function1.function();
        }
    }
}