class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magCount = new int[26];
        int[] ransomCount = new int[26];

        for (char c : magazine.toCharArray()) {
            magCount[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            ransomCount[c - 'a']++;

            if (ransomCount[c-'a'] > magCount[c - 'a']) {
                return false;
            }
        }
        return true;
    }
}