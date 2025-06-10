package problems.p0013_roman_to_integer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testSolution() {
        Solution solution = new Solution();
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
