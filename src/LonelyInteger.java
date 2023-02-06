import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-lonely-integer/problem">hackerrrank</a>
 */
public class LonelyInteger {
    public static void main(String[] args) {
        System.out.println(lonelyInteger(List.of(1,2,3,4,3,2,1)));
        System.out.println(betterLonelyInteger(List.of(1,2,3,4,3,2,1)));
        System.out.println(bestLonelyInteger(List.of(1,2,3,4,3,2,1)));
    }

    // dumb but acceptable
    public static int lonelyInteger(List<Integer> a) {
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
    public static int betterLonelyInteger(List<Integer> a) {
        long uniqueSum = new HashSet<>(a).stream().reduce(0, Integer::sum);
        long origSum = a.stream().reduce(0, Integer::sum);
        return (int) ((uniqueSum * 2) - origSum);
    }

    // using bitwise XOR operator, (a ^ b) ^ b = a
    public static int bestLonelyInteger(List<Integer> a) {
        return a.stream().reduce(0, (result, i) -> result ^ i);
    }
}
