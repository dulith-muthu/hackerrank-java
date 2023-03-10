package dulithm.hackerrank.challenges;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/queens-attack-2/problem">hackerrank</a>
 */
public class QueensAttackTwo {
    /**
     * You will be given a square chess board with one queen and a number of obstacles placed on it.<br/>
     * Determine how many squares the queen can attack.<br/><br/>
     * Consider the position of the queen in the board and calculate the possible move distances in each direction:
     * <ul>
     * <li>row/column bounds</li>
     * <li>forward/backwards diagonal bounds</li>
     * </ul>
     * After that loop each obstacle and determine if a particular obstacle falls
     * in-between the bounds that you defined earlier.
     * if so update the bounds and continue looping.<br/>
     * Finally, calculate the possible squares that the queen can move, using the updated bounds.
     *
     * @param n         the number of rows and columns in the board.
     * @param k         the number of obstacles on the board.
     * @param r_q       the row number of the queen's position.
     * @param c_q       the column number of the queen's position.
     * @param obstacles each element is an array (pair) of integers, the row and column of an obstacle.
     * @return the number of squares the queen can attack.
     */
    public int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        int[] rowBounds = {1, n},
            colBounds = {1, n};
        int[] fwDiag_distances = {Math.min(r_q - 1, c_q - 1), Math.min(n - r_q, n - c_q)};
        int[] bwDiag_distances = {Math.min(c_q - 1, n - r_q), Math.min(r_q - 1, n - c_q)};

        int sum = r_q + c_q, diff = c_q - r_q;
        obstacles
            .forEach(obstacle -> {
                if (obstacle.get(0) == r_q) {
                    if (obstacle.get(1) > c_q) {
                        colBounds[1] = Math.min(obstacle.get(1) - 1, colBounds[1]);
                    } else {
                        colBounds[0] = Math.max(obstacle.get(1) + 1, colBounds[0]);
                    }
                } else if (obstacle.get(1) == c_q) {
                    if (obstacle.get(0) > r_q) {
                        rowBounds[1] = Math.min(obstacle.get(0) - 1, rowBounds[1]);
                    } else {
                        rowBounds[0] = Math.max(obstacle.get(0) + 1, rowBounds[0]);
                    }
                } else if (obstacle.get(1) - obstacle.get(0) == diff) {
                    if (obstacle.get(0) > r_q) {
                        fwDiag_distances[1] = Math.min(obstacle.get(0) - r_q - 1, fwDiag_distances[1]);
                    } else {
                        fwDiag_distances[0] = Math.min(r_q - obstacle.get(0) - 1, fwDiag_distances[0]);
                    }
                } else if (obstacle.get(1) + obstacle.get(0) == sum) {
                    if (obstacle.get(0) > r_q) {
                        bwDiag_distances[0] = Math.min(obstacle.get(0) - r_q - 1, bwDiag_distances[0]);
                    } else {
                        bwDiag_distances[1] = Math.min(r_q - obstacle.get(0) - 1, bwDiag_distances[1]);
                    }
                }
            });

        return (rowBounds[1] - rowBounds[0]) +
            (colBounds[1] - colBounds[0]) +
            (fwDiag_distances[0] + fwDiag_distances[1]) +
            (bwDiag_distances[0] + bwDiag_distances[1]);
    }
}
