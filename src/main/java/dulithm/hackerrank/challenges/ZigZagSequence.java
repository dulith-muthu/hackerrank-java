package dulithm.hackerrank.challenges;

import java.util.Arrays;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-zig-zag-sequence">hackerrank</a>
 */
public class ZigZagSequence {
    /**
     * Fix the given function in only 3 changes.
     *
     * @param a int array.
     * @param n number of elements in a (always odd).
     */
    public int[] findZigZagSequence(int[] a, int n) {
        Arrays.sort(a);
        int mid = (n - 1) / 2; // Change 1, it was: (n + 1)/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2;  // Change 2, it was: int ed = n - 1;
        while (st <= ed) {
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1; // Change 2, it was: ed = ed + 1;
        }
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
        return a;
    }
}
