package problems.p0028_find_the_index_of_the_first_occurrence_in_a_string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testSolution() {
        Solution solution = new Solution();
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
    }
}
