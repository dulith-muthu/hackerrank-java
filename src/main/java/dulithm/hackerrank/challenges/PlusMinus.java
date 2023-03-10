package dulithm.hackerrank.challenges;

import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem">hakerrank</a>
 */
public class PlusMinus {
    /**
     * prints the ratios of plus minus and zero numbers in a given array.
     *
     * @param arr list of integers can be plus minus or zero.
     */
    public String plusMinus(List<Integer> arr) {
        double plus = 0, minus = 0, zero = 0, size = arr.size();
        for (Integer integer : arr) {
            if (integer < 0) {
                minus++;
            } else if (integer > 0) {
                plus++;
            } else {
                zero++;
            }
        }
        return String.format("%.6f%n%.6f%n%.6f%n", plus / size, minus / size, zero / size);
    }
}
