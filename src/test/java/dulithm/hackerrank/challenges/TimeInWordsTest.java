package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeInWordsTest {
    TimeInWords solution = new TimeInWords();

    @Test
    public void oClock() {
        assertEquals("five o' clock", solution.timeInWords(5, 0));
    }

    @Test
    public void quarterPast() {
        assertEquals("quarter past five", solution.timeInWords(5, 15));
    }

    @Test
    public void halfPast() {
        assertEquals("half past five", solution.timeInWords(5, 30));
    }

    @Test
    public void oneMinutePast() {
        assertEquals("one minute past five", solution.timeInWords(5, 1));
    }

    @Test
    public void threeMinutesPast() {
        assertEquals("three minutes past five", solution.timeInWords(5, 3));
    }

    @Test
    public void seventeenMinutesPast() {
        assertEquals("seventeen minutes past five", solution.timeInWords(5, 17));
    }

    @Test
    public void twentyMinutesPast() {
        assertEquals("twenty minutes past five", solution.timeInWords(5, 20));
    }

    @Test
    public void twentyFiveMinutesPast() {
        assertEquals("twenty five minutes past five", solution.timeInWords(5, 25));
    }

    @Test
    public void oneMinuteTo() {
        assertEquals("one minute to six", solution.timeInWords(5, 59));
    }

    @Test
    public void threeMinutesTo() {
        assertEquals("three minutes to six", solution.timeInWords(5, 57));
    }

    @Test
    public void thirteenMinutesTo() {
        assertEquals("thirteen minutes to six", solution.timeInWords(5, 47));
    }

    @Test
    public void quarterTo() {
        assertEquals("quarter to six", solution.timeInWords(5, 45));
    }

    @Test
    public void twentyMinutesTo() {
        assertEquals("twenty minutes to six", solution.timeInWords(5, 40));
    }

    @Test
    public void twentyOneMinutesTo() {
        assertEquals("twenty one minutes to six", solution.timeInWords(5, 39));
    }
}
