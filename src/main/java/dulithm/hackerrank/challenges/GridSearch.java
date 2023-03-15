package dulithm.hackerrank.challenges;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/the-grid-search/problem">hackerrank</a>
 */
public class GridSearch {
    /**
     * Given an array of strings of digits, try to find the occurrence of a given pattern of digits.
     * In the grid and pattern arrays, each string represents a row in the grid.
     *
     * @param G the grid to search.
     * @param P the grid to search.
     * @return <code>YES</code> if the pattern exists in the grid, or <code>NO</code> otherwise.
     */
    public String gridSearch(List<String> G, List<String> P) {
        final int patternHeight = P.size(),
                patternLen = P.get(0).length(),
                gridHeight = G.size(),
                gridLen = G.get(0).length();
        int nextPatternRow = 0;
        Set<Integer> startFrom = new HashSet<>();
        for (int i = 0; i < gridHeight; i++) {
            final String row = G.get(i);
            if (startFrom.size() > 0) {
                Set<Integer> removeList = new HashSet<>();
                for (Integer j : startFrom) {
                    int index = row.lastIndexOf(P.get(nextPatternRow), j);
                    if (index == -1) {
                        removeList.add(j);
                    }
                }
                startFrom.removeAll(removeList);
                if (startFrom.size() > 0) {
                    nextPatternRow++;
                } else {
                    nextPatternRow = 0;
                }
            }
            if (startFrom.size() == 0) {
                for (int j = patternLen - 1; j < gridLen; j++) {
                    int index = row.lastIndexOf(P.get(nextPatternRow), j);
                    if (index > -1) {
                        startFrom.add(index);
                    }
                }
                if (startFrom.size() > 0) {
                    nextPatternRow++;
                }
            }
            if (nextPatternRow == P.size()) {
                return "YES";
            }
            int remainingRows = gridHeight - i - 1;
            int rowsNeeded = patternHeight - nextPatternRow - 1;
            if (remainingRows < rowsNeeded) {
                break;
            }
        }
        return "NO";
    }
}
