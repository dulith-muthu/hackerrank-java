package dulithm.hackerrank.mocktests;

import java.util.List;
import java.util.stream.Stream;

public class FlippingTheMatrix {
    /**
     * transform a 2n x 2n matrix using only row and column flipping,
     * which maximizes the sum of all elements in top left n x n sub-matrix.<br/><br/>
     *
     * <h3>Method:</h3>
     * First identify that, for each element in the top left n x n sub matrix,
     * there are 3 other related elements in the other 3 sub-matrices inside the 2n x 2n matrix.
     * All those 4 related elements can be swapped in between, using only row and column flipping.<br/>
     * <i>Eg: for a 4 x 4 matrix, the related elements in each sub-matrix are indicated below.</i>
     * <pre>
     *     [1]  2   3  [4]    |     1  [2] [3]  4
     *      5   6   7   8     |     5   6   7   8
     *      1   2   3   4     |     1   2   3   4
     *     [5]  6   7  [8]    |     5  [6] [7]  8
     *     --------------------------------------
     *      1   2   3   4     |     1   2   3   4
     *     [5]  6   7  [8]    |     5  [6] [7]  8
     *     [1]  2   3  [4]    |     1  [2] [3]  4
     *      5   6   7   8     |     5   6   7   8
     * </pre>
     *
     * @param matrix 2n x 2n matrix
     * @return max sum of top left n x n sub-matrix
     */
    public int flippingMatrix(List<List<Integer>> matrix) {
        final int n2 = matrix.size(), n = n2 / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = matrix.get(i).get(j);
                int b = matrix.get(i).get(n2 - j - 1);
                int c = matrix.get(n2 - i - 1).get(j);
                int d = matrix.get(n2 - i - 1).get(n2 - j - 1);
                sum += Stream.of(a, b, c, d).reduce(Integer::max).orElse(0);
            }
        }
        return sum;
    }
}
