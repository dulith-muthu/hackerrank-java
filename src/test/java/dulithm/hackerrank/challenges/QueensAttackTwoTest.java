package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueensAttackTwoTest {
    QueensAttackTwo solution = new QueensAttackTwo();

    @Test
    public void withoutObstacles() {
        assertEquals(27, solution.queensAttack(8, 0, 4, 4, new ArrayList<>()));
    }

    @Test
    public void withObstacles() {
        List<List<Integer>> obs = Arrays.asList(
            Arrays.asList(5, 5),
            Arrays.asList(4, 2),
            Arrays.asList(2, 3)
        );
        assertEquals(10, solution.queensAttack(5, 3, 4, 3, obs));
    }

    @Test
    public void queenIsSurroundedWithObstacles() {
        List<List<Integer>> obs = Arrays.asList(
            Arrays.asList(3, 3),
            Arrays.asList(3, 4),
            Arrays.asList(3, 5),
            Arrays.asList(4, 3),
            Arrays.asList(4, 5),
            Arrays.asList(5, 3),
            Arrays.asList(5, 4),
            Arrays.asList(5, 5)
        );
        assertEquals(0, solution.queensAttack(8, 8, 4, 4, obs));
    }
}
