package fr.kata.fizzbuzz.java8;

import fr.kata.fizzbuzz.FizzBuzzConverter;

import java.util.stream.IntStream;

public class FizzBuzzPrinter {

    public static void main(String[] args) {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        IntStream.rangeClosed(1, 100).mapToObj(fizzBuzzConverter::convert).forEach(s -> System.out.println(s));
    }

}
