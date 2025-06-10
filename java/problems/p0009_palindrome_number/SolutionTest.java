package problems.p0009_palindrome_number;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testSolution() {
        Solution solution = new Solution();
        assertEquals(true, solution.isPalindrome(121));
        assertEquals(false, solution.isPalindrome(-121));
        assertEquals(false, solution.isPalindrome(10));
    }
}
