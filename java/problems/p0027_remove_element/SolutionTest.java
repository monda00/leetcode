package problems.p0027_remove_element;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class SolutionTest {
    @Test
    void testSolution() {
        Solution solution = new Solution();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int[] expectedNums1 = {2, 2};

        int k1 = solution.removeElement(nums1, val1);

        assertEquals(k1, expectedNums1.length);
        Arrays.sort(nums1, 0, k1);
        for (int i = 0; i < k1; i++) {
            assertEquals(nums1[i], expectedNums1[i]);
        }

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int[] expectedNums2 = {0, 0, 1, 3, 4};

        int k2 = solution.removeElement(nums2, val2);

        assertEquals(k2, expectedNums2.length);
        Arrays.sort(nums2, 0, k2);
        for (int i = 0; i < k2; i++) {
            assertEquals(nums2[i], expectedNums2[i]);
        }
    }
}
