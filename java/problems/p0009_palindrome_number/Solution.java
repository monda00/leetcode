package problems.p0009_palindrome_number;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String x_str = String.valueOf(x);

        for (int i = 0; i < x_str.length() / 2; i++) {
            if (x_str.charAt(i) != x_str.charAt(x_str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
