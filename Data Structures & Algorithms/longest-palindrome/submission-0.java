public class Solution {
    public int longestPalindrome(String s) {
        Set<Character> seen = new HashSet<>();
        int res = 0;

        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                seen.remove(c);
                res += 2;
            } else {
                seen.add(c);
            }
        }

        return seen.isEmpty() ? res : res + 1;
    }
}