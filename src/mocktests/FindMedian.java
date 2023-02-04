package mocktests;

import java.util.Comparator;
import java.util.List;

public class FindMedian {
    public static void main(String[] args) {
        System.out.println(findMedian(List.of(1, 2, 4, 5, 3)));
    }

    /**
     * find the median of a given unsorted array where array length is odd.
     *
     * @param arr array of integers.
     * @return median.
     */
    public static int findMedian(List<Integer> arr) {
        List<Integer> sorted = arr.stream().sorted(Comparator.comparingInt(o -> o)).toList();
        return sorted.get(sorted.size() / 2);
    }
}
