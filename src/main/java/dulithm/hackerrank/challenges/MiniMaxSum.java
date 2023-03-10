package dulithm.hackerrank.challenges;

import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem">hackerrank</a>
 */
public class MiniMaxSum {
    /**
     * Find and print the minimum and the maximum number that can be created by
     * summing (arr.size() - 1) number of elements in the array.
     *
     * @param arr array of integers.
     */
    public String miniMaxSum(List<Integer> arr) {
        int min = arr.get(0), max = arr.get(0);
        long sum = 0;
        for (Integer i : arr) {
            if (i < min) min = i;
            if (i > max) max = i;
            sum += i;
        }
        return String.format("%d %d", sum - max, sum - min);
    }

}
