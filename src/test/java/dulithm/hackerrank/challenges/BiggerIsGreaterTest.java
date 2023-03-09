package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiggerIsGreaterTest {
    BiggerIsGreater solution = new BiggerIsGreater();

    @Test
    public void simpleSwap() {
        assertEquals("ba", solution.biggerIsGreater("ab"));
    }

    @Test
    public void noPossibleGreaterText() {
        assertEquals("no answer", solution.biggerIsGreater("bb"));
    }

    @Test
    public void checkIfChainingTheMethodEndsUpInTheGreatestText() {
        String str = "abcde";
        for (int i = 1; i < 120; i++) { // nPr(5,5) = 120
            str = solution.biggerIsGreater(str);
        }
        assertEquals("edcba", str);
    }
}
