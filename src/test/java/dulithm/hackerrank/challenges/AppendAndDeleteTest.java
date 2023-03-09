package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppendAndDeleteTest {
    AppendAndDelete solution = new AppendAndDelete();

    @Test
    public void providedExactNumberOfOperationsNeeded() {
        assertEquals("Yes", solution.appendAndDelete("hackerhappy", "hackerrank", 9));
    }

    @Test
    public void notProvidedEnoughNumberOfOperationsNeeded() {
        assertEquals("No", solution.appendAndDelete("ashley", "ash", 2));
    }

    @Test
    public void providedMoreOperationsThanNeededAndEnoughToRewriteTheCompleteString() {
        assertEquals("Yes", solution.appendAndDelete("aba", "aba", 8));
    }

    @Test
    public void providedMoreOperationsThanNeededButNotEnoughToRewriteTheCompleteString() {
        assertEquals("No", solution.appendAndDelete("hello", "hellobro", 10));
    }
}
