package dulithm.hackerrank.challenges;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-lonely-integer/problem">hackerrrank</a>
 */
public class LonelyInteger {
    /**
     * Given an array of integers, where all elements but one occur twice, find the unique element.
     * Find better solutions below, this is dumb but acceptable.
     *
     * @param a array of integers
     * @return lonely integer
     */
    public int lonelyInteger(List<Integer> a) {
        final Set<Integer> found = new HashSet<>();
        for (Integer i : a) {
            if (found.contains(i)) {
                found.remove(i);
            } else {
                found.add(i);
            }
        }
        return found.stream().findFirst().orElse(0);
    }

    // convert to set remove duplicates, then :  sum(unique) * 2 - sum(original) = lonely
    public int betterLonelyInteger(List<Integer> a) {
        long uniqueSum = new HashSet<>(a).stream().reduce(0, Integer::sum);
        long origSum = a.stream().reduce(0, Integer::sum);
        return (int) ((uniqueSum * 2) - origSum);
    }

    // using bitwise XOR operator, (a ^ b) ^ b = a
    public int bestLonelyInteger(List<Integer> a) {
        return a.stream().reduce(0, (result, i) -> result ^ i);
    }
}
