class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            int[] key = new int[26];

            for (char c : word.toCharArray()) {
                key[c - 'a']++;
            }
            String keyString = Arrays.toString(key);
            map.putIfAbsent(keyString, new ArrayList<>());
            map.get(keyString).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
