package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarCipherTest {
    CaesarCipher solution = new CaesarCipher();

    @Test
    public void alphabetCheck() {
        assertEquals("bcdefghijklmnopqrstuvwxyza-BCDEFGHIJKLMNOPQRSTUVWXYZA",
            solution.caesarCipher("abcdefghijklmnopqrstuvwxyz-ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1));
    }

    @Test
    public void noPossibleGreaterText() {
        assertEquals("Wkhuh'v-d-vwdupdq-zdlwlqj-lq-wkh-vnb",
            solution.caesarCipher("There's-a-starman-waiting-in-the-sky", 3));
    }
}
