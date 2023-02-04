import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem">hackerrank</a>
 */
public class MiniMaxSum {
    public static void main(String[] args) {
        miniMaxSum(List.of(1, 2, 3, 4, 5));
    }

    /**
     * Find and print the minimum and the maximum number that can be created by
     * summing (arr.size() - 1) number of elements in the array.
     *
     * @param arr array of integers.
     */
    public static void miniMaxSum(List<Integer> arr) {
        int min = Integer.MAX_VALUE, max = 0;
        long sum = 0;
        for (Integer i : arr) {
            if (i < min) min = i;
            if (i > max) max = i;
            sum += i;
        }
        System.out.printf("%d %d%n", sum - max, sum - min);
    }

}
