class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int ans = 1001;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] < ans) {
                ans = nums[mid];
            }

            if (nums[l] <= nums[mid] && nums[l] < nums[r]) {
                r = mid - 1;
            } else if (nums[mid] < nums[r]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
