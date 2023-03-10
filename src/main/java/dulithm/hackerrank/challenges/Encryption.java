package dulithm.hackerrank.challenges;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/encryption/problem?isFullScreen=false">hackerrank</a>
 */
public class Encryption {
    /**
     * <p>An English text needs to be encrypted using the following encryption scheme.<br/>
     * First, the spaces are removed from the text. Let L be the length of this text.<br/>
     * Then, characters are written into a grid, whose rows and columns have the following constraints:</p>
     * <pre>floor(sqrt(L)) <= row <= column <= ceil(sqrt(L))</pre>
     *
     * @param s plaintext
     * @return ciphertext
     */
    public String encryption(String s) {
        String spaceRemoved = s.replaceAll(" ", "");
        if (spaceRemoved.length() == 1) return spaceRemoved;
        int len = spaceRemoved.length(), ceil = 1;
        // does not need the actual sqrt, just need an approximation
        while (ceil * ceil < len) {
            ceil++;
        }
        List<String> enc = IntStream.range(0, ceil).mapToObj(a -> "").collect(Collectors.toList());
        for (int i = 0; i < len; i++) {
            // append each letter to relevant column
            int row = i % ceil;
            String encRow = enc.get(row).concat(spaceRemoved.substring(i, i + 1));
            enc.set(row, encRow);
        }
        return String.join(" ", enc);
    }
}
