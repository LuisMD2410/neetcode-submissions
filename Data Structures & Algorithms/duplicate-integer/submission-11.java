class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (ans.contains(nums[i])) {
                return true;
            }
            else {
                ans.add(nums[i]);
            }
        }
        return false;
    }
}