package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiagonalDifferenceTest {
    DiagonalDifference solution = new DiagonalDifference();

    @Test
    public void singleValue() {
        List<List<Integer>> matrix = List.of(
            List.of(1)
        );
        assertEquals(0, solution.diagonalDifference(matrix));
    }

    @Test
    public void IdentityMatrix() {
        List<List<Integer>> matrix = List.of(
            List.of(1, 0),
            List.of(0, 1)
        );
        assertEquals(2, solution.diagonalDifference(matrix));
    }

    @Test
    public void allPositiveValues() {
        List<List<Integer>> matrix = List.of(
            List.of(1, 2, 3),
            List.of(4, 5, 6),
            List.of(9, 8, 9)
        );
        assertEquals(2, solution.diagonalDifference(matrix));
    }

    @Test
    public void withNegativeValues() {
        List<List<Integer>> matrix = List.of(
            List.of(11, 2, 4),
            List.of(4, 5, 6),
            List.of(10, 8, -12)
        );
        assertEquals(15, solution.diagonalDifference(matrix));
    }
}
