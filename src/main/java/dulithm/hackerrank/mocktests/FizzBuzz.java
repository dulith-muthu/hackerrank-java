package dulithm.hackerrank.mocktests;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    /**
     * divisible by 3 & 5 - FizzBuzz
     * divisible by 3 only - Fizz
     * divisible by 5 only - Buzz
     * otherwise - i
     *
     * @param n check for all numbers between 1 and n.
     */
    public List<String> fizzBuzz(int n) {
        final String FOR3AND5 = "FizzBuzz", FOR3 = "Fizz", FOR5 = "Buzz";
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String out = String.valueOf(i);
            boolean by3 = i % 3 == 0, by5 = i % 5 == 0;
            if (by5) out = FOR5;
            if (by3) out = FOR3;
            if (by3 && by5) out = FOR3AND5;
            System.out.println(out);
            list.add(out);
        }
        return list;
    }
}
