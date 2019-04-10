package fr.kata.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzConverterTest {

    /*
    Write a program that prints the numbers from 1 to 100.
    But for multiples of three convert “Fizz” instead of the number and for the multiples of five convert “Buzz”.
    For numbers which are multiples of both three and five convert “FizzBuzz “.
     */

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4})
    public void shouldPrintNumbers(int candidate) {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assertions.assertEquals(Integer.toString(candidate), fizzBuzzConverter.convert(candidate));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 9, 12, 18})
    public void shouldFizzifyMultiplesOfThree(int candidate) {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assertions.assertEquals("Fizz", fizzBuzzConverter.convert(candidate));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    public void shouldBuzzifyMultiplesOfFive(int candidate) {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assertions.assertEquals("Buzz", fizzBuzzConverter.convert(candidate));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    public void shouldFizzBuzzifyMultipleOfFiveAndThree(int candidate) {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assertions.assertEquals("FizzBuzz", fizzBuzzConverter.convert(candidate));
    }

}
