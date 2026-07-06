class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       List<Integer>[] freq = new ArrayList[nums.length + 1];
       Map<Integer, Integer> count = new HashMap<>();

       for (int i = 0; i < nums.length + 1; i++) {
            freq[i] = new ArrayList<Integer>();
       }

       for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
       }

       for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
       }

       int[] res = new int[k];
       int index = 0;
       for (int i = nums.length; i > 0; i--) {
            for (int num : freq[i]) {
                res[index] = num;
                index++;
            }
            if (index == k) {
                return res;
            }
       }
       return res;
    }
}
