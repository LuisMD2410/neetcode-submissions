class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res = 0;
        int l = 0;
        int sum = 0;
        threshold *= k;

        for (int r = 0; r < arr.length; r++) {
            int window = r - l + 1;
            sum += arr[r];

            if (window == k) {
                if (sum >= threshold) {
                    res++;
                }

                sum -= arr[l];
                l++;
            }
        }
        return res;
    }
}