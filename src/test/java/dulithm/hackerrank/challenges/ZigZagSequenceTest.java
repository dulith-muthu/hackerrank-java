package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagSequenceTest {
    ZigZagSequence solution = new ZigZagSequence();

    @Test
    void findZigZagSequence() {
        int[] in = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] out = new int[]{1, 2, 3, 4, 9, 8, 7, 6, 5};
        assertArrayEquals(out, solution.findZigZagSequence(in, in.length));
    }
}
