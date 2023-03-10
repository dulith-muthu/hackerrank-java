package dulithm.hackerrank.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/non-divisible-subset/problem">hackerrank</a>
 */
public class NonDivisibleSubset {
    /**
     * Given a set of distinct integers, print the size of a maximal subset of <code>S</code>
     * where the sum of any 2 numbers in <code>S'</code> is not evenly divisible by <code>K</code>.<br/>
     *
     * <small>(Had to get help from the forum)</small><br/><br/>
     * Sum of two numbers A, B is divisible by K if
     * <pre>(A % K) + (B % K) = K or 0</pre>
     * using this we can solve.<br/>
     * These sets can be considered as pairs, and we can take larger set from each pair.<br/>
     * we can only take 1 number form the set of numbers where <code>(X % K) = 0</code>.<br/>
     * if <code>K</code> is even we can only take 1 number form the set of numbers where <code>(X % K) = K / 2</code>
     *
     * @param k divider
     * @param s distinct integer list
     * @return resultant set length
     */
    public int nonDivisibleSubset(int k, List<Integer> s) {
        int maxSetLen = 0;
        Map<Integer, Integer> remainders = new HashMap<>();
        for (int val : s) {
            int remainder = val % k;
            remainders.put(remainder, Optional.ofNullable(remainders.get(remainder)).orElse(0) + 1);
        }
        for (int i = 1; i < (k / 2 + k % 2); i++) {
            int left = Optional.ofNullable(remainders.get(i)).orElse(0);
            int right = Optional.ofNullable(remainders.get(k - i)).orElse(0);
            maxSetLen += Math.max(left, right);
        }
        maxSetLen += remainders.get(0) != null ? 1 : 0;
        if (k % 2 == 0) {
            maxSetLen += remainders.get(k / 2) != null ? 1 : 0;
        }
        return maxSetLen;
    }
}
