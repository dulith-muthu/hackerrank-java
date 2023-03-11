package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeConversionTest {
    TimeConversion solution = new TimeConversion();

    @Test
    void twelveAMTimeConversion() {
        assertEquals("00:05:45", solution.timeConversion("12:05:45AM"));
    }

    @Test
    void twelvePMTimeConversion() {
        assertEquals("12:05:45", solution.timeConversion("12:05:45PM"));
    }

    @Test
    void otherAMTimeConversion() {
        assertEquals("07:05:45", solution.timeConversion("07:05:45AM"));
    }

    @Test
    void otherPMTimeConversion() {
        assertEquals("19:05:45", solution.timeConversion("07:05:45PM"));
    }
}
