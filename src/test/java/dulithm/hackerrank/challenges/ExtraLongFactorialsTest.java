package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraLongFactorialsTest {
    ExtraLongFactorials solution = new ExtraLongFactorials();

    @Test
    public void lowerBound() {
        assertEquals("1", solution.extraLongFactorials(1));
    }

    @Test
    public void upperBound() {
        String factHundred = "9332621544394415268169923885626670049071596826438162146859296389521759999322991560894" +
            "1463976156518286253697920827223758251185210916864000000000000000000000000";
        assertEquals(factHundred, solution.extraLongFactorials(100));
    }

    @Test
    public void mid() {
        String factFifty = "30414093201713378043612608166064768844377641568960512000000000000";
        assertEquals(factFifty, solution.extraLongFactorials(50));
    }
}
