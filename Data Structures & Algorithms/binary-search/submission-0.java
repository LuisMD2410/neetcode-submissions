class Solution {
    public int search(int[] nums, int target) {
        int L = 0, R = nums.length - 1;

        while (L <= R) {
            int mid = (L + R) / 2;
            int midNum = nums[mid];
            if (midNum < target) {
                L = ++mid;
            } else if (midNum > target) {
                R = --mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
