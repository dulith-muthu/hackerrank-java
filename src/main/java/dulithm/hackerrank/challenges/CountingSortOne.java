package dulithm.hackerrank.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-countingsort1/problem">hackerrank</a>
 */
public class CountingSortOne {
    /**
     * Given a list of integers, count and return the number of times each value appears as an array of integers.
     *
     * @param arr list of integers where: <code>0 <= arr[i] < 100</code>
     * @return a list of 100 integers where each index contains how many times each number appeared in <code>arr</code>
     */
    public List<Integer> countingSort(List<Integer> arr) {
        List<Integer> zeros = new ArrayList<>(Collections.nCopies(100, 0));
        return arr.parallelStream().reduce(zeros, (result, i) -> {
            result.set(i, result.get(i) + 1);
            return result;
        }, (a, b) -> a);
    }
}
