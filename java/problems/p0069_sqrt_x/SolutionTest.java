package problems.p0069_sqrt_x;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testSolution() {
        Solution solution = new Solution();
        assertEquals(2, solution.mySqrt(4));
        assertEquals(2, solution.mySqrt(8));
    }
}
