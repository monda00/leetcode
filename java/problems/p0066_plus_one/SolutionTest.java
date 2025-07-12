package problems.p0066_plus_one;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testSolution() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 3, 2, 2}, solution.plusOne(new int[]{4, 3, 2, 1}));
        assertArrayEquals(new int[]{1, 0}, solution.plusOne(new int[]{9}));
    }
}
