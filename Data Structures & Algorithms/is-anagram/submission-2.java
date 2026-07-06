class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> seenS = new HashMap<>();
        HashMap<Character, Integer> seenT = new HashMap<>();

        for (char c : s.toCharArray()) {
            seenS.put(c, seenS.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            seenT.put(c, seenT.getOrDefault(c, 0) + 1);
        }

        return seenS.equals(seenT);
    }
}
