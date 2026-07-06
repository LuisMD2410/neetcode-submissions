class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length = nums.length + 1;
        int l = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                length = Math.min(length, i - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        if (length == nums.length + 1) return 0; else return length;
    }
}