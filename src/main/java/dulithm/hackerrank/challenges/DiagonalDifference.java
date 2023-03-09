package dulithm.hackerrank.challenges;

import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-diagonal-difference/problem">hackerrank</a>
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
            List.of(1, 2, 3),
            List.of(4, 5, 6),
            List.of(9, 8, 9)
        );
        System.out.println(diagonalDifference(matrix));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        final int n = arr.size();
        int diff = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> curr = arr.get(i);
            diff += curr.get(i) - curr.get(n - (i + 1));
        }
        return Math.abs(diff);
    }
}
