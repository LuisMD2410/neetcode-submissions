class Solution {
    public int[] productExceptSelf(int[] nums) {
        int counter = 0;
        int[] arr = new int[nums.length];
        int total = 1;
        int zero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                total = total * nums[i];
            }
            else {
                zero++;
            }
        }

        if (zero > 1) {
            return new int[nums.length];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                arr[i] = total;
            }
            else if (zero > 0) {
                arr[i] = 0;
            }
            else {
                arr[i] = total / nums[i];
            }
        }

        return arr;
    }
}  
