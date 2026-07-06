class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> dict = new HashMap<>();
        dict.put(')', '(');
        dict.put('}', '{');
        dict.put(']', '[');

        for (Character c : s.toCharArray()) {
            if (dict.containsKey(c)) {
                if (!stack.isEmpty() && stack.pop() == dict.get(c)) {
                    continue;
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
