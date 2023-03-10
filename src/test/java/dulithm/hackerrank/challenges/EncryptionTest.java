package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionTest {
    Encryption solution = new Encryption();

    @Test
    public void singleLetterPlaintext() {
        assertEquals("a", solution.encryption("a"));
    }

    @Test
    public void firstSamplePlaintext() {
        assertEquals("hae and via ecy", solution.encryption("have a nice day"));
    }

    @Test
    public void secondSamplePlaintext() {
        assertEquals("fto ehg ee dd", solution.encryption("feed the dog"));
    }

    @Test
    public void thirdSamplePlaintext() {
        assertEquals("clu hlt io", solution.encryption("chill out"));
    }
}
