package problems.p0058_length_of_last_word;

class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int ret = 0;
        for (int i = trimmed.length() - 1; i >= 0; i--) {
            char c = trimmed.charAt(i);
            if (c == ' ') {
                break;
            }
            ret++;
        }
        return ret;
    }
}
