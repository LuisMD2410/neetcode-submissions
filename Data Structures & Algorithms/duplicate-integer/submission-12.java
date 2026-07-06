class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (res.contains(nums[i])) {
                return true;
            }
            res.add(nums[i]);
        }
        return false;
    }
}