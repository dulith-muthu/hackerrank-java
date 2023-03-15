package dulithm.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GridSearchTest {
    GridSearch solution = new GridSearch();
    @Test
    public void simplePatternContains() {
        List<String> grid = List.of(
                "1234567890",
                "0987654321",
                "1111111111",
                "1111111111",
                "2222222222"
        ), pattern = List.of(
                "876543",
                "111111",
                "111111"
        );
        assertEquals("YES", solution.gridSearch(grid, pattern));
    }

    @Test
    public void multiplePatternRowsOnlySingleCompletePattern() {
        List<String> grid = List.of(
                "1234567890",
                "1111111111",
                "1112211111",
                "0987654321",
                "2222222222"
        ), pattern = List.of(
                "111",
                "432",
                "222"
        );
        assertEquals("YES", solution.gridSearch(grid, pattern));
    }

    @Test
    public void patternDoesNotContain() {
        List<String> grid = List.of(
                "400453592126560",
                "114213133098692",
                "474386082879648",
                "522356951189169",
                "887109450487496",
                "252802633388782",
                "502771484966748",
                "075975207693780",
                "511799789562806",
                "404007454272504",
                "549043809916080",
                "962410809534811",
                "445893523733475",
                "768705303214174",
                "650629270887160"
        ), pattern = List.of(
                "99",
                "99"
        );
        assertEquals("NO", solution.gridSearch(grid, pattern));
    }
}
