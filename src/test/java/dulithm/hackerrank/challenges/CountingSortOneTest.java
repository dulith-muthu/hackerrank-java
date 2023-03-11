package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class CountingSortOneTest {
    CountingSortOne solution = new CountingSortOne();

    @Test
    public void forSomeRandomNumbers() {
        List<Integer> values = Arrays.asList(1, 2, 3, 10, 20, 30, 50, 90, 99, 1, 50);
        List<Integer> answer = Arrays.asList(
                0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1);
        assertIterableEquals(answer, solution.countingSort(values));
    }

    @Test
    public void testingParallelStream() {
        List<Integer> values = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 99, 99, 99, 99, 99, 99);
        List<Integer> answer = new ArrayList<>(Collections.nCopies(100, 0));
        answer.set(1, 7);
        answer.set(99, 6);
        assertIterableEquals(answer, solution.countingSort(values));
    }
}
