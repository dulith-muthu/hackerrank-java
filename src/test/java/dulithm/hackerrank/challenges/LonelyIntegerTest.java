package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LonelyIntegerTest {
    LonelyInteger solution = new LonelyInteger();

    @Test
    public void usingHashMap() {
        assertEquals(4, solution.lonelyInteger(List.of(1, 2, 3, 4, 3, 2, 1)));
    }

    @Test
    public void usingHashSetAndSums() {
        assertEquals(4, solution.betterLonelyInteger(List.of(1, 2, 3, 4, 3, 2, 1)));
    }

    @Test
    public void usingXOR() {
        assertEquals(4, solution.bestLonelyInteger(List.of(1, 2, 3, 4, 3, 2, 1)));
    }
}
