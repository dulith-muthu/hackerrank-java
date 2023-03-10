package dulithm.hackerrank.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/extra-long-factorials/problem">hackerrank</a>
 */
public class ExtraLongFactorials {
    /**
     * Returns the factorial of a given number. they can be extra long.
     *
     * @param n an integer where: <code>1 <= n <= 100</code>
     * @return factorial of n as a string
     */
    public String extraLongFactorials(int n) {
        if (n == 1) {
            return "1";
        }
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        for (int i = 2; i <= n; i++) {
            int remainder = 0;
            for (int j = 0; j < nums.size(); j++) {
                int multi = (nums.get(j) * i) + remainder;
                remainder = multi / 10;
                nums.set(j, multi % 10);
            }
            while (remainder != 0) {
                nums.add(remainder % 10);
                remainder /= 10;
            }
        }
        Collections.reverse(nums);
        return nums.stream().collect(Collector.of(
            StringBuilder::new,
            StringBuilder::append,
            StringBuilder::append,
            StringBuilder::toString));
    }
}