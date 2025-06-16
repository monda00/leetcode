package problems.p0014_longest_common_prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        if (strs.length == 0) {
            return prefix.toString();
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || c != strs[j].charAt(i)) {
                    return prefix.toString();
                }
            }

            prefix.append(c);
        }

        return prefix.toString();
    }
}
