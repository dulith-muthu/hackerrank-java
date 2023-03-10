package dulithm.hackerrank.challenges;

import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-diagonal-difference/problem">hackerrank</a>
 */
public class DiagonalDifference {
    /**
     * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
     *
     * @param arr square matrix as a 2d list. <code>-100 <= arr[i] <= 100</code>
     * @return diagonal difference positive int
     */
    public int diagonalDifference(List<List<Integer>> arr) {
        final int n = arr.size();
        int diff = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> curr = arr.get(i);
            diff += curr.get(i) - curr.get(n - (i + 1));
        }
        return Math.abs(diff);
    }
}
