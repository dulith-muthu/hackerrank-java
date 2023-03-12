package dulithm.hackerrank.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/matrix-rotation-algo/problem">hackerrank</a>
 */
public class MatrixLayerRotation {
    /**
     * You are given a 2D matrix of dimension <code>m x n</code> and a positive integer <code>r</code>.
     * You have to rotate the matrix <code>r</code> times and print the resultant matrix.
     * Rotation should be in anti-clockwise direction.
     * It is guaranteed that the minimum of <code>m</code> and <code>n</code> will be even.<br/><br/>
     * <h3>Method</h3><ul>
     * <li>First, Calculate number of loops</li>
     * <li>For each loop calculate the number of elements in the loop</li>
     * <li>Then, Rotate each element by the given <code>r</code></li>
     * <li>update the resultant matrix</li>
     * </ul>
     *
     * @param matrix m x n matrix where: <code>2 <= m,n <= 300</code>
     * @param r      rotation factor where: <code>1 <= r <= 10<sup>9</sup></code>
     */
    public List<List<Integer>> matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size(),
                n = matrix.get(0).size(),
                min = Math.min(m, n),
                loops = min >> 1;
        List<List<Integer>> rMatrix = new ArrayList<>();
        Collections.nCopies(m, new ArrayList<>(Collections.nCopies(n, 0)))
                .forEach(list -> rMatrix.add(new ArrayList<>(list)));
        for (int l = 0; l < loops; l++) {
            int lm = m - (l << 1), ln = n - (l << 1), loopEl = (lm + ln - 2) << 1;
            for (int e = 0; e < loopEl; e++) {
                int[] fromPos = getPosition(lm, ln, l, loopEl, e);
                int[] toPos = getPosition(lm, ln, l, loopEl, e + r);
                rMatrix.get(toPos[0]).set(toPos[1], matrix.get(fromPos[0]).get(fromPos[1]));
            }
        }
        return rMatrix;
    }

    /**
     * Returns the main matrix <code>(i, j)</i,></code> position vector for a given number of rotations in
     * a rotation loop.
     * eg: for a <code>4 x 5</code> matrix consider most outer rotation loop:<ul>
     * <li><code>lm</code> is 4 (4 rows in the outer loop)</li>
     * <li><code>ln</code> is 5 (5 columns in the outer loop)</li>
     * <li><code>l</code> is 0 (0<sup>th</sup> loop is the most outer loop)</li>
     * <li><code>loopEl</code> is 14, we can count 14 elements in the outer loop</li>
     * <li><code>d</code> lets assume distance is 9, loop start point is <code>(0, 0)</code></li>
     * <li>outer loop distance calculation path:<pre>
     *     (0,0) <- (0,1) <- (0,2) <- (0,3) <- (0,4)
     *       v                                   ^
     *     (1,0)    (1,1)    (1,2)    (1,3)    (1,4)
     *       v                                   ^
     *     (2,0)    (2,1)    (2,2)    (2,3)    (2,4)
     *       v                                   ^
     *     (3,0) -> (3,1) -> (3,2) -> (3,3) -> (3,4)</pre></li>
     * <li>if you count 9 elements from starting element <code>(0, 0)</code> along the most outer loop,
     * you will end up in the element <code>(1,4)</code></li>
     * </ul>
     *
     * @param lm     number of rows in the loop
     * @param ln     number of columns in the loop
     * @param l      <code>l<sup>th</sup></code> in the main matrix
     * @param loopEl number of elements in the loop: <code>loopEl = (lm + ln - 2) x 2</code>
     * @param d      distance from the loop start point: <code>(l, l)</code>
     * @return <code>(i, j)</code> position vector
     */
    public int[] getPosition(int lm, int ln, int l, int loopEl, int d) {
        int effR = d % (loopEl);
        int[] ij = new int[]{0, 0};
        if (effR < lm) {
            ij[0] = l + effR;
            ij[1] = l;
        } else if (effR < lm + ln - 1) {
            ij[0] = l + lm - 1;
            ij[1] = l + effR - lm + 1;
        } else if (effR < ((lm << 1) + ln - 2)) {
            ij[0] = l - effR + (lm << 1) + ln - 3;
            ij[1] = l + ln - 1;
        } else {
            ij[0] = l;
            ij[1] = l - effR + (lm << 1) + (ln << 1) - 4;
        }
        return ij;
    }
}
