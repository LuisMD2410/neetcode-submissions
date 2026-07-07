class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = 0;
        int windowLength = s1.length();
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (Character ch : s1.toCharArray()) {
            s1Count[ch - 'a']++;
        }

        for (int r = 0; r < s2.length(); r++) {
            s2Count[s2.charAt(r) - 'a']++;
            if (r - l + 1 > windowLength) {
                s2Count[s2.charAt(l) - 'a']--;
                l++;
            }

            if (Arrays.equals(s1Count, s2Count)) {
                return true;
            }
        }
        return false;
    }
}
