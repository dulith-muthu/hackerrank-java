package dulithm.hackerrank.mocktests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz solution = new FizzBuzz();

    @Test
    void fizzBuzz() {
        List<String> out = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"
        );
        assertIterableEquals(out, solution.fizzBuzz(15));
    }
}
