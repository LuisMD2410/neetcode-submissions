class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int length = 0;
        Set<Character> duplicates = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);

            while (duplicates.contains(curChar)) {
                duplicates.remove(s.charAt(l));
                l++;
            }

            duplicates.add(curChar);
            length = Math.max(length, i - l + 1);
        }
        return length;
    }
}
