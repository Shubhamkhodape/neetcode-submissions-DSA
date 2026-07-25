public class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }

        for (int num : nums) {
            int a = 0;
            int c = num;
            while (s.contains(c)) {
                a++;
                c++;
            }
            res = Math.max(res, a);
        }
        return res;
    }
}