import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-countingsort1/problem">hackerrank</a>
 */
public class CountingSortOne {
    public static void main(String[] args) {
        List<Integer> values = List.of(1, 2, 3, 10, 20, 30, 50, 90, 99, 1, 50);
        countingSort(values).forEach(i -> System.out.printf("%d ", i));
        System.out.println();
    }

    /*
     * Complete the 'countingSort' function below.
     *
     * arr[i] is between 0 and 99
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> zeros = new ArrayList<>(Collections.nCopies(100, 0));
        return arr.stream().reduce(zeros, (result, i) -> {
            result.set(i, result.get(i) + 1);
            return result;
        }, (a, b) -> a);
    }
}
