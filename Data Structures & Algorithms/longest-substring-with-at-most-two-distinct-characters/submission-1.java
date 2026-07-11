class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int[] freq = new int[26];
        int l = 0;
        int res = 0;
        int distinctCount = 0;

        for (int r = 0; r < s.length(); r++) {
            if (freq[s.charAt(r) - 'a'] == 0) {
                distinctCount++;
                freq[s.charAt(r) - 'a']++;
            } else {
                freq[s.charAt(r) - 'a']++;
            }

            while (distinctCount > 2) {
                freq[s.charAt(l) - 'a']--;
                if (freq[s.charAt(l) - 'a'] == 0) {
                    distinctCount--;
                }
                l++;
            }

            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}