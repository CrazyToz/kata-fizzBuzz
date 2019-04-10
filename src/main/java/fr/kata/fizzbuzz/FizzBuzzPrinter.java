package fr.kata.fizzbuzz;

/**
 * Hello world!
 *
 */
public class FizzBuzzPrinter
{
    public static void main( String[] args )
    {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzzConverter.convert(i));
        }
    }
}
