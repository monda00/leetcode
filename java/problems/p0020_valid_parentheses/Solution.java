package problems.p0020_valid_parentheses;

class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                sb.append(current);
            } else {
                if (sb.length() == 0) {
                    return false;
                }

                char last = sb.charAt(sb.length() - 1);
                if ((current == ')' && last == '(') ||
                    (current == ']' && last == '[') ||
                    (current == '}' && last == '{')) {
                        sb.deleteCharAt(sb.length() - 1);
                } else {
                    return false;
                }
            }
        }

        return sb.length() == 0;
    }
}
