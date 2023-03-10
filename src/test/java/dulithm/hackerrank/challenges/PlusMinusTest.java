package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusMinusTest {
    PlusMinus solution = new PlusMinus();

    @Test
    public void forAnOddValueOfK() {
        List<Integer> in = Arrays.asList(-4, 3, -9, 0, 4, 1);
        String out = String.format("%s%n%s%n%s%n", "0.500000", "0.333333", "0.166667");
        assertEquals(out, solution.plusMinus(in));
    }
}
