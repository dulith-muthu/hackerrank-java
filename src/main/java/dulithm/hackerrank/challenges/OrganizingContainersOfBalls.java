package dulithm.hackerrank.challenges;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem">hackerrank</a>
 */
public class OrganizingContainersOfBalls {
    /**
     * n number of containers contains balls that are labeled 0 to (n - 1)
     * performs some number of swap operations such that:
     * <ul>
     * <li>Each container contains only balls of the same type.</li>
     * <li>No two balls of the same type are located in different containers.</li>
     * </ul>
     * <p>
     * Method: number of total balls in each container initially should match with number of total balls of each type
     * what I did not know is, I need to sort those two sum arrays before comparing
     * because:
     * <pre>
     *   1 4 0
     *   3 1 0
     *   0 0 1
     * </pre>
     * <p>
     * here sum arrays would be:
     * <pre>
     *   container sum (row sums) = [5, 4, 1]
     *   ball sum (column sum)    = [4, 5, 1]
     * </pre>
     * both arrays not exactly same but each element is in a different place, this is still solvable
     *
     * @param container matrix of the initial container-ball relationship. (row -> container, column -> ball)
     * @return returns <code>"Possible"</code> if we can organize by swapping, otherwise <code>"Impossible"</code>
     */
    public String organizingContainers(List<List<Integer>> container) {
        long[] rowSums = new long[container.size()], colSums = new long[container.size()];
        for (int i = 0; i < container.size(); i++) {
            long sum = 0;
            for (int j = 0; j < container.get(i).size(); j++) {
                int balls = container.get(i).get(j);
                colSums[j] += balls;
                sum += balls;
            }
            rowSums[i] = sum;
        }
        // checking sums, sort operation is a bit unnecessary here, so...
        for (long rowSum : rowSums) {
            int i = -1;
            while (true) {
                i++;
                if (i >= container.size()) {
                    return "Impossible";
                }
                if (colSums[i] == rowSum) {
                    colSums[i] = -1L;
                    break;
                }
            }
        }
        return "Possible";
    }
}
