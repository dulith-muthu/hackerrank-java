package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonDivisibleSubsetTest {
    NonDivisibleSubset solution = new NonDivisibleSubset();

    @Test
    public void forAnOddValueOfK() {
        assertEquals(3, solution.nonDivisibleSubset(4, List.of(19, 10, 12, 24, 25, 22)));
    }

    @Test
    public void forAnEvenValueOfK() {
        assertEquals(3, solution.nonDivisibleSubset(3, List.of(1, 7, 2, 4)));
    }
}
