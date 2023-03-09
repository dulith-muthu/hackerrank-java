package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeTest {
    CoinChange solution = new CoinChange();

    @Test
    public void withThreeCoins() {
        assertEquals(4L, solution.getWays(4, List.of(1L, 2L, 3L)));
    }

    @Test
    public void withFourCoins() {
        assertEquals(10L, solution.getWays(20, List.of(1L, 10L, 5L, 20L)));
    }
}
