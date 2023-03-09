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
    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(4, List.of(19, 10, 12, 24, 25, 22)));
        System.out.println(nonDivisibleSubset(3, List.of(1, 7, 2, 4)));
    }

    /**
     * sum of two numbers A, B is divisible by K if
     * (A % K) + (B % K) = K or 0
     * using this we can solve
     * these sets can be considered as pairs, and we can take larger set from each pair.
     * we can only take 1 number form the set of numbers where (X % K) = 0
     * if K is even we can only take 1 number form the set of numbers where (X % K) = K / 2
     *
     * @param k divider
     * @param s distinct integer list
     * @return resultant set length
     */
    public static int nonDivisibleSubset(int k, List<Integer> s) {
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
