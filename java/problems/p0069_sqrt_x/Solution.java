package problems.p0069_sqrt_x;

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int a = 0;
        int b = x / 2 + 1;
        int mid;

        while (b - a > 1) {
            mid = (a + b) / 2;

            if ((long)mid*mid <= x) {
                a = mid;
            } else {
                b = mid;
            }
        }

        return a;
    }
}
