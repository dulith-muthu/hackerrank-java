package dulithm.hackerrank.mocktests;

import java.util.List;
import java.util.stream.Stream;

public class FlippingTheMatrix {
    public static void main(String[] args) {
        List<List<Integer>> input = List.of(
                List.of(112, 42, 83, 119),
                List.of(56, 125, 56, 49),
                List.of(15, 78, 101, 43),
                List.of(62, 98, 114, 108));
        System.out.println(flippingMatrix(input)); // => 414


        List<List<Integer>> input2 = List.of(
                List.of(107, 54, 128, 15),
                List.of(12, 75, 110, 138),
                List.of(100, 96, 34, 85),
                List.of(75, 15, 28, 112)); // => 488
        System.out.println(flippingMatrix(input2));
    }

    /**
     * transform a 2n x 2n matrix using only row and column flipping,
     * which maximizes the sum of all elements in top left n x n sub-matrix.
     *
     * @param matrix 2n x 2n matrix
     * @return max sum of top left n x n sub-matrix
     */
    public static int flippingMatrix(List<List<Integer>> matrix) {
        final int n2 = matrix.size(), n = n2 / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = matrix.get(i).get(j);
                int b = matrix.get(i).get(n2 - j - 1);
                int c = matrix.get(n2 - i - 1).get(j);
                int d = matrix.get(n2 - i -1).get(n2 - j - 1);
                sum += Stream.of(a,b,c,d).reduce(Integer::max).orElse(0);
            }
        }
        return sum;
    }
}
