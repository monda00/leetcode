package problems.p0020_valid_parentheses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testSolution() {
        Solution solution = new Solution();
        assertEquals(true, solution.isValid("()"));
        assertEquals(true, solution.isValid("()[]{}"));
        assertEquals(false, solution.isValid("(]"));
        assertEquals(true, solution.isValid("([])"));
    }
}
