package dulithm.hackerrank.challenges;

import java.util.stream.Collector;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-caesar-cipher-1/problem">hackerrank</a>
 */
public class CaesarCipher {
    /**
     * Julius Caesar protected his confidential information by encrypting it using a cipher.
     * shifts each letter by a number of letters. If the shift takes you past the end of the alphabet,
     * just rotate back to the front of the alphabet.
     *
     * @param s plaintext
     * @param k number of rotations
     * @return cypher text
     */
    public String caesarCipher(String s, int k) {
        final int char_A = 65, char_Z = 90, char_a = 97, char_z = 122, char_tot = 26;
        int rotate = k % char_tot;
        if (rotate == 0) return s;
        return s.chars().map(c -> {
            int cypher = c;
            if (c >= char_A && c <= char_Z) {
                cypher = (cypher + rotate);
                cypher = cypher > char_Z ? (cypher - char_tot) : cypher;
            } else if (c >= char_a && c <= char_z) {
                cypher = (cypher + rotate);
                cypher = cypher > char_z ? (cypher - char_tot) : cypher;
            }
            return cypher;
        }).mapToObj(c -> (char) c).collect(Collector.of(
            StringBuilder::new,
            StringBuilder::append,
            StringBuilder::append,
            StringBuilder::toString));
    }
}
