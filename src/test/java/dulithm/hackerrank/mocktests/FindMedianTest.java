package dulithm.hackerrank.mocktests;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindMedianTest {
    FindMedian solution = new FindMedian();

    @Test
    void findMedian() {
        assertEquals(3, solution.findMedian(List.of(1, 2, 4, 5, 3)));
    }
}
