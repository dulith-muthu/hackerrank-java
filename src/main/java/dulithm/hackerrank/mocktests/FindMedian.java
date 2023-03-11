package dulithm.hackerrank.mocktests;

import java.util.Comparator;
import java.util.List;

public class FindMedian {
    /**
     * find the median of a given unsorted array where array length is odd.
     *
     * @param arr array of integers.
     * @return median.
     */
    public int findMedian(List<Integer> arr) {
        List<Integer> sorted = arr.stream().sorted(Comparator.comparingInt(o -> o)).toList();
        return sorted.get(sorted.size() / 2);
    }
}
