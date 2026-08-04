class Solution {
    public List<String> commonChars(String[] words) {
         List<String> result = new ArrayList<>();
        int[] minFreq = new int[26];
        
        // Initialize minFreq with the first word's character counts
        for (char c : words[0].toCharArray()) {
            minFreq[c - 'a']++;
        }
        
        // Update minFreq with the lowest counts found in the remaining words
        for (int i = 1; i < words.length; i++) {
            int[] charCount = new int[26];
            for (char c : words[i].toCharArray()) {
                charCount[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], charCount[j]);
            }
        }
        
        // Build the final list based on the minimum frequencies
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }
        
        return result; 
    }
}