package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerBreakersOneTest {
    TowerBreakersOne solution = new TowerBreakersOne();

    @Test
    public void towerHeightIsOne() {
        assertEquals(2, solution.towerBreakers(100000, 1));
    }

    @Test
    public void evenNumberOfTowers() {
        assertEquals(2, solution.towerBreakers(61092, 2596));
    }

    @Test
    public void oddNumberOfTowers() {
        assertEquals(1, solution.towerBreakers(276941, 868497));
    }
}
