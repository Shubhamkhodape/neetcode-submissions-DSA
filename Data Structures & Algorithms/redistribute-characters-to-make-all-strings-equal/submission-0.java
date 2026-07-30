public class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> ch = new HashMap<>();

        for (String w : words) {
            for (char c : w.toCharArray()) {
                ch.put(c, ch.getOrDefault(c, 0) + 1);
            }
        }

        for (int count : ch.values()) {
            if (count % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}