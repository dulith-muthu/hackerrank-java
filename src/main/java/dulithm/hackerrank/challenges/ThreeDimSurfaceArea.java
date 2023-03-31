package dulithm.hackerrank.challenges;

import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/3d-surface-area/problem">hackerrank</a>
 */
public class ThreeDimSurfaceArea {
    /**
     * Stacks <code>1 x 1</code> cubes in a <code>H x W</code> 2D space and find the surface area of the
     * compound object.
     *
     * @param a matrix <code>H x W</code>. a<sub>ij</sub> holds the number of stacked cubes
     * @return surface area.
     */
    public int surfaceArea(List<List<Integer>> a) {
        final int H = a.size();
        final int W = a.get(0).size();
        int sum = 2 * H * W;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int up = i - 1 > -1 ? a.get(i - 1).get(j) : 0;
                int left = j - 1 > -1 ? a.get(i).get(j - 1) : 0;
                int current = a.get(i).get(j);
                sum += Math.abs(up - current);
                sum += Math.abs(left - current);
                sum += i == H - 1 ? current : 0;
                sum += j == W - 1 ? current : 0;
            }
        }
        return sum;
    }

}
