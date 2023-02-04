import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem">hakerrank</a>
 */
public class PlusMinus {
    public static void main(String[] args) {
        plusMinus(List.of(-4, 3, -9, 0, 4, 1));
    }

    /**
     * prints the ratios of plus minus and zero numbers in a given array.
     *
     * @param arr list of integers can be plus minus or zero.
     */
    public static void plusMinus(List<Integer> arr) {
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
        System.out.printf("%.6f%n%.6f%n%.6f%n", plus / size, minus / size, zero / size);
    }
}
