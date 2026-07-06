class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new ArrayList[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] arr = new int[k];
        int counter = 0;
        for (int i = nums.length; i > 0; i--) {
            for (int n : freq[i]) {
                arr[counter] = n;
                counter++;
                if (counter == k) {
                    return arr;
                }
            }
        }
        return arr;
    }
}
