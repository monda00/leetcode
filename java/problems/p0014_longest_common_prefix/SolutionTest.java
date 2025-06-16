package problems.p0014_longest_common_prefix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testSolution() {
        Solution solution = new Solution();
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", solution.longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
        assertEquals("a", solution.longestCommonPrefix(new String[] { "ab", "a" }));
    }
}
