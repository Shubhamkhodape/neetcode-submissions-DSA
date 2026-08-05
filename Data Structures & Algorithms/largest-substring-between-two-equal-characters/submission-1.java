public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> charIndex = new HashMap<>();
        int res = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charIndex.containsKey(c)) {
                res = Math.max(res, i - charIndex.get(c) - 1);
            } else {
                charIndex.put(c, i);
            }
        }

        return res;
    }
}