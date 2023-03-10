package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganizingContainersOfBallsTest {
    OrganizingContainersOfBalls solution = new OrganizingContainersOfBalls();
    private final String possible = "Possible", impossible = "Impossible";

    @Test
    public void canSolveAndBallsInSameContainerId() {
        List<List<Integer>> container = Arrays.asList(
            Arrays.asList(2, 1),
            Arrays.asList(1, 3)
        );
        assertEquals(possible, solution.organizingContainers(container));
    }

    @Test
    public void canSolveButBallsInDifferentContainerIds() {
        List<List<Integer>> container = Arrays.asList(
            Arrays.asList(2, 50),
            Arrays.asList(10, 2)
        );
        assertEquals(possible, solution.organizingContainers(container));
    }

    @Test
    public void cannotSolve() {
        List<List<Integer>> container = Arrays.asList(
            Arrays.asList(0, 2),
            Arrays.asList(1, 1)
        );
        assertEquals(impossible, solution.organizingContainers(container));
    }

    @Test
    public void cannotSolve3x3() {
        List<List<Integer>> container = Arrays.asList(
            Arrays.asList(1, 3, 1),
            Arrays.asList(2, 1, 2),
            Arrays.asList(3, 3, 3)
        );
        assertEquals(impossible, solution.organizingContainers(container));
    }

    @Test
    public void canSolve3x3() {
        List<List<Integer>> container = Arrays.asList(
            Arrays.asList(1, 1, 1),
            Arrays.asList(2, 1, 1),
            Arrays.asList(1, 1, 1)
        );
        assertEquals(possible, solution.organizingContainers(container));
    }
}
