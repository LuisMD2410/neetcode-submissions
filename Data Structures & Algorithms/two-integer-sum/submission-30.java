class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int want = target - nums[i];
            if (seen.containsKey(want)) {
                return new int[]{seen.get(want),i};
            } else {
                seen.putIfAbsent(nums[i], i);
            }
        }
        return null;
    }
}
