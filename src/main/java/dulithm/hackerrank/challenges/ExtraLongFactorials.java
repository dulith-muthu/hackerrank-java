package dulithm.hackerrank.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/extra-long-factorials/problem">hackerrank</a>
 */
public class ExtraLongFactorials {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            extraLongFactorials(i);
        }
    }

    public static void extraLongFactorials(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
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
        nums.forEach(System.out::print);
        System.out.println();
    }
}