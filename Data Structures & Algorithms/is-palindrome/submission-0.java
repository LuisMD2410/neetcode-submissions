class Solution {
    public boolean isPalindrome(String s) {
        String cleanStr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int L = 0, R = (cleanStr.length() - 1);

        while (L < R) {
            if (cleanStr.charAt(L) != cleanStr.charAt(R)) {
                return false;
            }
            L++;
            R--;
        }
        if (L == R && cleanStr.charAt(L) != cleanStr.charAt(R)) {
            return false;
        }

        return true;
    }
}
