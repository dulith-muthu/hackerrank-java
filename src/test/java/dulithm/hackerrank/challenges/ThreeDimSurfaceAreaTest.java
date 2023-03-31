package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeDimSurfaceAreaTest {
    ThreeDimSurfaceArea solution = new ThreeDimSurfaceArea();

    @Test
    void baseCase() {
        List<List<Integer>> unitCase = List.of(List.of(1));
        assertEquals(6, this.solution.surfaceArea(unitCase));
    }

    @Test
    void providedScenario() {
        List<List<Integer>> unitCase = List.of(
            List.of(1, 3, 4),
            List.of(2, 2, 3),
            List.of(1, 2, 4)
        );
        assertEquals(60, this.solution.surfaceArea(unitCase));
    }

    @Test
    void notSquare() {
        List<List<Integer>> unitCase = List.of(
            List.of(1, 1, 1),
            List.of(2, 2, 2)
        );
        // 2 * 6 + 6 + 6 + 3 + 3 = 30
        assertEquals(30, this.solution.surfaceArea(unitCase));
    }
}