class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int length = 0;
        Set<Character> duplicates = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);

            if (s.charAt(l) == curChar && l != i) {
                duplicates.remove(s.charAt(l));
                l++;
            } else if (duplicates.contains(curChar)) {
                duplicates.clear();
                l = i;
            }

            duplicates.add(curChar);
            length = Math.max(length, i - l + 1);
        }
        return length;
    }
}
