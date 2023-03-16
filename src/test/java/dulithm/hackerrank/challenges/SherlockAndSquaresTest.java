package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndSquaresTest {
    SherlockAndSquares solution = new SherlockAndSquares();

    @Test
    void hasSquaresInBetween() {
        assertEquals(2, solution.squares(3, 9));
    }

    @Test
    void hasNoSquaresInBetween() {
        assertEquals(0, solution.squares(17, 24));
    }

    @Test
    void getSqrtApproximation() {
        List<Integer> input = List.of(1, 2, 4, 50, 70, 100, 100000000);
        List<Integer> out = List.of(1, 1, 2, 7, 8, 10, 10000);
        assertIterableEquals(out, input.stream().map(solution::getSqrtApproximation).collect(Collectors.toList()));
    }
}