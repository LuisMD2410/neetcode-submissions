class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] list = new List[nums.length + 1];

        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list[entry.getValue()].add(entry.getKey());
        }

        int[] arr = new int[k];
        int counter = 0;
        for (int i = nums.length; i > 0; i--) {
            for (int n : list[i]) {
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
