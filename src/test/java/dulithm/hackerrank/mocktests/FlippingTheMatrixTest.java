package dulithm.hackerrank.mocktests;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlippingTheMatrixTest {
    FlippingTheMatrix solution = new FlippingTheMatrix();

    @Test
    void flippingMatrix2x2() {
        List<List<Integer>> input = List.of(
                List.of(1, 2),
                List.of(3, 4));
        assertEquals(4, solution.flippingMatrix(input));
    }

    @Test
    void flippingMatrix4x4() {
        List<List<Integer>> input = List.of(
                List.of(112, 42, 83, 119),
                List.of(56, 125, 56, 49),
                List.of(15, 78, 101, 43),
                List.of(62, 98, 114, 108));
        assertEquals(414, solution.flippingMatrix(input));
    }
}
