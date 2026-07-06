class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int ans = 1001;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int lNum = nums[l];
            int rNum = nums[r];
            int midNum = nums[mid];

            if (midNum < ans) {
                ans = midNum;
            }

            if (lNum <= midNum && lNum < rNum) {
                r = mid - 1;
            } else if (midNum < rNum) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
