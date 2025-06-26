package problems.p0026_remove_duplicates_from_sorted_array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void testSolution() {
        Solution solution = new Solution();

        int[] nums1 = {1, 1, 2};
        int[] expectedNums1 = {1, 2};

        int k1 = solution.removeDuplicates(nums1);

        assertEquals(k1, expectedNums1.length);
        for (int i = 0; i < k1; i++) {
            assertEquals(nums1[i], expectedNums1[i]);
        }

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums2 = {0, 1, 2, 3, 4};

        int k2 = solution.removeDuplicates(nums2);

        assertEquals(k2, expectedNums2.length);
        for (int i = 0; i < k2; i++) {
            assertEquals(nums2[i], expectedNums2[i]);
        }
    }
}
