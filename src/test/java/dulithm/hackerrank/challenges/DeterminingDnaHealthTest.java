package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeterminingDnaHealthTest {

    @Test
    void providedExample() {
        List<String> genes = Arrays.asList("a", "b", "c", "aa", "d", "b");
        List<Integer> health = Arrays.asList(1, 2, 3, 4, 5, 6);
        DeterminingDnaHealth solution = new DeterminingDnaHealth(genes, health);
        long[] dnaHealthArray = new long[]{
                solution.getDnaHealth(1, 5, "caaab"),
                solution.getDnaHealth(0, 4, "xyz"),
                solution.getDnaHealth(2, 4, "bcdybc")
        };
        assertArrayEquals(new long[]{19L, 0L, 11L}, dnaHealthArray);

        long[] healthPair = new long[]{solution.getUnhealthiestDna(), solution.getHealthiestDna()};
        assertArrayEquals(new long[]{0L, 19L}, healthPair);
    }

    @Test
    void newExample() {
        List<String> genes = Arrays.asList("aa", "a", "aa", "aaa", "aaaa", "a");
        List<Integer> health = Arrays.asList(2, 1, 2, 3, 4, 1);
        DeterminingDnaHealth solution = new DeterminingDnaHealth(genes, health);
        long[] dnaHealthArray = new long[]{
                solution.getDnaHealth(0, 5, "hello"),
                solution.getDnaHealth(0, 5, "aa"),
                solution.getDnaHealth(0, 5, "aaa"),
                solution.getDnaHealth(0, 5, "bbaa"),
                solution.getDnaHealth(0, 5, "aaabbbbaaa"),
                solution.getDnaHealth(0, 5, "aaaaa"),
        },
                expected = new long[]{
                        0L,
                        8L,
                        17L,
                        8L,
                        34L,
                        43L
        };
        assertArrayEquals(expected, dnaHealthArray);
    }
}
