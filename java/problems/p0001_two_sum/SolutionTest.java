package problems.p0001_two_sum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testBasicCase() {
        Solution solution = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));

        nums = new int[] { 3, 2, 4 };
        target = 6;
        expected = new int[] { 1, 2 };
        assertArrayEquals(expected, solution.twoSum(nums, target));

        nums = new int[] { 3, 3 };
        target = 6;
        expected = new int[] { 0, 1 };
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}