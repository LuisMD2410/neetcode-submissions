class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            if (ans.contains(nums[i])) {
                result = true;
            }
            else {
                ans.add(nums[i]);
            }
        }
        return result;
    }
}