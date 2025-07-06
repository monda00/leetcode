package problems.p0058_length_of_last_word;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testSolution() {
        Solution solution = new Solution();
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
    }
}
