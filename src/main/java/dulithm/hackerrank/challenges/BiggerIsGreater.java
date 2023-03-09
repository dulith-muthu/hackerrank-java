package dulithm.hackerrank.challenges;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/bigger-is-greater/problem">hackerrank</a>
 */
public class BiggerIsGreater {
    /**
     * Given a word, create a new word by swapping some or all of its characters. This new word must meet two criteria:
     * <li>It must be greater than the original word</li>
     * <li>It must be the smallest word that meets the first condition</li>
     *
     * @param w word
     * @return new word if possible or "no answer"
     */
    public String biggerIsGreater(String w) {
        List<Integer> asciis = w.chars().boxed().collect(Collectors.toList());
        int len = asciis.size(), minIdx, i;
        boolean found = false;
        for (i = len - 2; i > -1; i--) {
            if (asciis.get(i) < asciis.get(i + 1)) {
                found = true;
                break;
            }
        }
        if (found) {
            minIdx = i + 1;
            for (int j = i + 2; j < len; j++) {
                minIdx = asciis.get(minIdx) > asciis.get(j) && asciis.get(j) > asciis.get(i) ? j : minIdx;
            }
            int min = asciis.remove(minIdx);
            List<Integer> pre = asciis.subList(0, i), post = asciis.subList(i, len - 1), combined;
            combined = new ArrayList<>(pre);
            combined.add(min);
            post.sort(Comparator.comparingInt(o -> o));
            combined.addAll(post);
            return combined.stream()
                .mapToInt(Integer::intValue)
                .mapToObj(c -> (char) c).collect(Collector.of(
                    StringBuilder::new,
                    StringBuilder::append,
                    StringBuilder::append,
                    StringBuilder::toString));
        }
        return "no answer";
    }
}