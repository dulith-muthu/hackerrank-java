package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiniMaxSumTest {
    MiniMaxSum solution = new MiniMaxSum();

    @Test
    public void usingHashMap() {
        assertEquals("10 14", solution.miniMaxSum(List.of(1, 2, 3, 4, 5)));
    }
}
