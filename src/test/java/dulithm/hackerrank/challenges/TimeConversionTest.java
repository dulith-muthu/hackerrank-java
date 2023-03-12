package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeConversionTest {
    TimeConversion solution = new TimeConversion();

    @Test
    public void twelveAMTimeConversion() {
        assertEquals("00:05:45", solution.timeConversion("12:05:45AM"));
    }

    @Test
    public void twelvePMTimeConversion() {
        assertEquals("12:05:45", solution.timeConversion("12:05:45PM"));
    }

    @Test
    public void otherAMTimeConversion() {
        assertEquals("07:05:45", solution.timeConversion("07:05:45AM"));
    }

    @Test
    public void otherPMTimeConversion() {
        assertEquals("19:05:45", solution.timeConversion("07:05:45PM"));
    }
}
