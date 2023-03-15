package dulithm.hackerrank.challenges;

import java.util.*;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/determining-dna-health/problem">hackerrank</a>
 */
public class DeterminingDnaHealth {
    private final List<String> genes;
    private final List<Integer> health;
    private long healthiestDna = Long.MIN_VALUE;
    private long unhealthiestDna = Long.MAX_VALUE;

    /**
     * This class preserves a state of healthiest/unhealthiest gene, while each DNA health is calculated.
     *
     * @param genes  An array of beneficial gene strings, not guaranteed to be distinct.
     * @param health An array of gene health values, where each element is the health value for corresponding gene
     */
    public DeterminingDnaHealth(List<String> genes, List<Integer> health) {
        this.genes = genes;
        this.health = health;
    }

    /**
     * Calculates DNA health for a given dna using initialized gene and health arrays.
     * Updates healthiest and Unhealthiest DNA health values.
     * TODO: <h1>need to optimize this!</h1>
     *
     * @param first starting index of gene array
     * @param last  last index of gene array
     * @param dna   DNA string
     * @return calculated DNA health
     */
    public Long getDnaHealth(int first, int last, String dna) {
        final Map<String, Integer> geneOccurrences = new HashMap<>();
        long dnaHealth = 0L;
        for (int g = first; g <= last; g++) {
            String gene = genes.get(g);
            if (!geneOccurrences.containsKey(gene)) {
                Set<Integer> occurrences = new HashSet<>();
                for (int i = 0; i < dna.length(); i++) {
                    int index = dna.lastIndexOf(gene, i);
                    if (index > -1) {
                        occurrences.add(index);
                    }
                }
                geneOccurrences.put(gene, occurrences.size());
            }
            dnaHealth += (long) geneOccurrences.get(gene) * health.get(g);
        }
        healthiestDna = Math.max(healthiestDna, dnaHealth);
        unhealthiestDna = Math.min(unhealthiestDna, dnaHealth);
        return dnaHealth;
    }

    public long getHealthiestDna() {
        return healthiestDna;
    }

    public long getUnhealthiestDna() {
        return unhealthiestDna;
    }
}
