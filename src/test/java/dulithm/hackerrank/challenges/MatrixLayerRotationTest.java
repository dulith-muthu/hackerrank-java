package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MatrixLayerRotationTest {
    MatrixLayerRotation solution = new MatrixLayerRotation();

    @Test
    public void getPosition6x4Matrix() {
        int[][] actual = new int[][]{
                solution.getPosition(6, 4, 0, 16, 2),
                solution.getPosition(6, 4, 0, 16, 6),
                solution.getPosition(6, 4, 0, 16, 11),
                solution.getPosition(6, 4, 0, 16, 15),
                solution.getPosition(6, 4, 0, 16, 16),
                solution.getPosition(4, 2, 1, 8, 2),
                solution.getPosition(4, 2, 1, 8, 4),
                solution.getPosition(4, 2, 1, 8, 6),
                solution.getPosition(4, 2, 1, 8, 7),
                solution.getPosition(4, 2, 1, 8, 8),
        };
        int[][] expected = new int[][]{
                {2, 0}, {5, 1}, {2, 3}, {0, 1}, {0, 0}, {3, 1}, {4, 2}, {2, 2}, {1, 2}, {1, 1}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void matrixAllElementsAreSame() {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(1, 1)
        );
        assertIterableEquals(matrix, solution.matrixRotation(matrix, 3));
    }

    @Test
    public void for5x4Matrix() {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(7, 8, 9, 10),
                Arrays.asList(13, 14, 15, 16),
                Arrays.asList(19, 20, 21, 22),
                Arrays.asList(25, 26, 27, 28)
        );
        List<List<Integer>> rMatrix = Arrays.asList(
                Arrays.asList(28, 27, 26, 25),
                Arrays.asList(22, 9, 15, 19),
                Arrays.asList(16, 8, 21, 13),
                Arrays.asList(10, 14, 20, 7),
                Arrays.asList(4, 3, 2, 1)
        );
        assertIterableEquals(rMatrix, solution.matrixRotation(matrix, 7));
    }

    @Test
    public void for4x6Matrix() {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1, 16, 15, 14, 13, 12),
                Arrays.asList(2, 1, 8, 7, 6, 11),
                Arrays.asList(3, 2, 3, 4, 5, 10),
                Arrays.asList(4, 5, 6, 7, 8, 9)
        );
        List<List<Integer>> rMatrix = Arrays.asList(
                Arrays.asList(14, 13, 12, 11, 10, 9),
                Arrays.asList(15, 6, 5, 4, 3, 8),
                Arrays.asList(16, 7, 8, 1, 2, 7),
                Arrays.asList(1, 2, 3, 4, 5, 6)
        );
        assertIterableEquals(rMatrix, solution.matrixRotation(matrix, 19));
    }
}
